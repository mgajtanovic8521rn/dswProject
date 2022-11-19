package gui.swing.tree;

import core.ApplicationFramework;
import gui.swing.tree.controller.TreeMouseListener;
import gui.swing.tree.model.MapTreeItem;
import gui.swing.tree.view.MapTreeView;
import gui.swing.view.MainFrame;
import messageGenerator.MessageType;
import repository.Implementation.Element;
import repository.Implementation.MindMap;
import repository.Implementation.Project;
import repository.Implementation.ProjectExplorer;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;
import repository.factory.MapNodeFactory;
import repository.factory.UtilEnumerator;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class MapTreeImplementation implements MapTree{
    private MapTreeView treeView;
    private DefaultTreeModel treeModel;



    @Override
    public MapTreeView generateTree(ProjectExplorer projectExplorer) {
        MapTreeItem root = new MapTreeItem(projectExplorer);
        treeModel = new DefaultTreeModel(root);
        treeView = new MapTreeView(treeModel);
        treeView.addMouseListener(new TreeMouseListener());

        return treeView;
    }

    @Override
    public void addChild(MapTreeItem parent) {

        if (!(parent.getMapNode() instanceof MapNodeComposite)){
            ApplicationFramework.getInstance().getMessageGenerator().generateMessage(MessageType.CANT_ADD_CHILD);
            return;
        }

        MapNodeFactory factory = ApplicationFramework.getInstance().getMapRepository().getFactory(parent.getMapNode());
        MapNode child = factory.createMapNode(parent.getMapNode());

        parent.add(new MapTreeItem(child));     //dodavanje u stablo
        ((MapNodeComposite) parent.getMapNode()).addChild(child);       //dodavanje u model
        treeView.expandPath(treeView.getSelectionPath());
        SwingUtilities.updateComponentTreeUI(treeView);     //ovo ne sme da stoji ako observer radi
    }

    @Override
    public void removeChild(MapTreeItem node) {

        if(node.getMapNode() instanceof ProjectExplorer){
            ApplicationFramework.getInstance().getMessageGenerator().generateMessage(MessageType.PROJECT_EXPLORER_DELETE);
            return;
        }

        ((DefaultMutableTreeNode)node.getParent()).remove(node);        //brisanje iz stabla
        ((MapNodeComposite)node.getMapNode().getParent()).removeChild(node.getMapNode());       //brisanje iz modela

        if(node.getMapNode().getParent() instanceof ProjectExplorer){       //ne svidja nam se, ali nismo znali kako da projectExplorer javi u projectView da project ne postoji
            MainFrame.getInstance().getProjectView().setProject(null);
        }

        SwingUtilities.updateComponentTreeUI(treeView);     //ovo ne sme da stoji ako observer radi
    }

    @Override
    public MapTreeItem getSelectedNode() {
        return (MapTreeItem) treeView.getLastSelectedPathComponent();
    }


    @Override
    public void expand() {
        treeView.expandPath(treeView.getSelectionPath());
    }
}
