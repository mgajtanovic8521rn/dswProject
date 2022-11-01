package gui.swing.controller;

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
        JOptionPane.showMessageDialog(MainFrame.getInstance(),"Edit akcija");
    }
}
