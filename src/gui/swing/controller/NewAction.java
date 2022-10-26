package gui.swing.controller;

import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NewAction extends AbstractActionGeruMap{

    public NewAction() {
        putValue(SMALL_ICON,loadIcon("images/icons8-new-48.png"));
        putValue(NAME,"New");
        putValue(SHORT_DESCRIPTION,"New");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(MainFrame.getInstance(),"new akcija");
    }
}
