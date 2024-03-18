package gui.swing.controller;

import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class InfoAction extends AbstractActionGeruMap{


    public InfoAction() {
        putValue(SMALL_ICON,loadIcon("/images/infoIcon.png"));
        putValue(NAME,"Info");
        putValue(SHORT_DESCRIPTION,"Info");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(MainFrame.getInstance(),"Marija Gajtanovic 85/21rn");
    }
}
