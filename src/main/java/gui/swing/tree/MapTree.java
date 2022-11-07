package gui.swing.tree;

import gui.swing.tree.model.MapTreeItem;
import gui.swing.tree.view.MapTreeView;
import repository.Implementation.ProjectExplorer;

public interface MapTree {
    MapTreeView generateTree(ProjectExplorer projectExplorer);
    void addChild(MapTreeItem parent);
    MapTreeItem getSelectedNode();
}
