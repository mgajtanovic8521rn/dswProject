package gui.swing.controller;

import gui.swing.tree.model.MapTreeItem;
import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RemoveAction extends AbstractActionGeruMap {



    public RemoveAction() {
        putValue(SMALL_ICON,loadIcon("/images/exitIcon.png"));
        putValue(NAME,"Remove");
        putValue(SHORT_DESCRIPTION,"Remove");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        MapTreeItem selected = (MapTreeItem) MainFrame.getInstance().getMapTree().getSelectedNode();
        MainFrame.getInstance().getMapTree().removeChild(selected);
    }
}
