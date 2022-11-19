package gui.swing.controller;

import gui.swing.tree.model.MapTreeItem;
import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EditAction extends AbstractActionGeruMap{

    public EditAction() {
        putValue(SMALL_ICON,loadIcon("/images/editIcon.png"));
        putValue(NAME,"Edit");
        putValue(SHORT_DESCRIPTION,"Edit");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        MapTreeItem selected = MainFrame.getInstance().getMapTree().getSelectedNode();
        String newName = JOptionPane.showInputDialog(MainFrame.getInstance(),"Unesite zeljeno ime");
        MainFrame.getInstance().getMapTree().getSelectedNode().getMapNode().setName(newName);
    }
}
