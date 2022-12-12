package gui.swing.tree;

import gui.swing.tree.model.MapTreeItem;
import gui.swing.tree.view.MapTreeView;
import gui.swing.view.ElementView;
import gui.swing.view.PojamView;
import gui.swing.view.VezaView;
import repository.Implementation.Element;
import repository.Implementation.MindMap;
import repository.Implementation.ProjectExplorer;
import repository.Implementation.Veza;

import java.util.List;

public interface MapTree {
    MapTreeView generateTree(ProjectExplorer projectExplorer);
    void addChild(MapTreeItem parent);
    void removeChild(MapTreeItem node);
    MapTreeItem getSelectedNode();
    void expand();
    void refresh();
    void addElement(Element element, MindMap mindMap);
    void removeElement(MindMap mindMap, List<PojamView> pojmovi, List<VezaView> veze);
}
