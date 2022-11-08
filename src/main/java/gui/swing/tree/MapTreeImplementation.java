package gui.swing.tree;

import gui.swing.tree.model.MapTreeItem;
import gui.swing.tree.view.MapTreeView;
import repository.Implementation.Element;
import repository.Implementation.MindMap;
import repository.Implementation.Project;
import repository.Implementation.ProjectExplorer;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.Random;

public class MapTreeImplementation implements MapTree{
    private MapTreeView treeView;
    private DefaultTreeModel treeModel;



    @Override
    public MapTreeView generateTree(ProjectExplorer projectExplorer) {
        MapTreeItem root = new MapTreeItem(projectExplorer);
        treeModel = new DefaultTreeModel(root);
        treeView = new MapTreeView(treeModel);
        return treeView;
    }

    @Override
    public void addChild(MapTreeItem parent) {

        if (!(parent.getMapNode() instanceof MapNodeComposite))
            return;

        MapNode child = createChild(parent.getMapNode());
        parent.add(new MapTreeItem(child));
        ((MapNodeComposite) parent.getMapNode()).addChild(child);
        treeView.expandPath(treeView.getSelectionPath());
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public void removeChild(MapTreeItem node) {
        ((DefaultMutableTreeNode)node.getParent()).remove(node);
        SwingUtilities.updateComponentTreeUI(treeView);
    }

    @Override
    public MapTreeItem getSelectedNode() {
        return (MapTreeItem) treeView.getLastSelectedPathComponent();
    }

    private MapNode createChild(MapNode parent) {
        if (parent instanceof ProjectExplorer)
            return  new Project("Project" + UtilEnumerator.getEnum("project"), parent);
        if (parent instanceof Project)
            return  new MindMap("MindMap" + UtilEnumerator.getEnum("mindMap"), parent);
        if (parent instanceof MindMap)
            return  new Element("Element" + UtilEnumerator.getEnum("element"), parent);

        return null;
    }

}
