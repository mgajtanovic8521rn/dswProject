package gui.swing.controller;

import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class InfoAction extends AbstractActionGeruMap{


    public InfoAction() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(MainFrame.getInstance(),"Stevan Dabizljevic 3920rn\nMilan Kosanovic 5820rn");
    }
}
