package gui.swing.controller;

import gui.swing.command.implementation.ChangeElementCommand;
import gui.swing.view.MainFrame;
import gui.swing.view.MindMapView;
import gui.swing.view.PojamView;
import gui.swing.view.VezaView;
import repository.Implementation.Veza;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class EditElementAction extends AbstractActionGeruMap {

    public EditElementAction() {
        putValue(SMALL_ICON,loadIcon("/images/editElement.png"));
        putValue(NAME,"Edit Elements");
        putValue(SHORT_DESCRIPTION,"Edit Elements");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MindMapView mindMapView = MainFrame.getInstance().getProjectView().getActiveMindMap();



        JLabel labelaLine = new JLabel("Unesite zeljenu deblinu linije (px)");
        JTextArea jTextAreaLine = new JTextArea();
        JColorChooser jColorChooser = new JColorChooser();
        jTextAreaLine.setText("2");
        JComponent[] komponente = new JComponent[]{
                jColorChooser,labelaLine,jTextAreaLine
        };
        int result = JOptionPane.showConfirmDialog(MainFrame.getInstance(), komponente, "My custom dialog", JOptionPane.PLAIN_MESSAGE);
        Color boja = jColorChooser.getColor();
        int deblinaLinije = Integer.valueOf(jTextAreaLine.getText());
        if(result == JOptionPane.OK_OPTION){
            MainFrame.getInstance().getCommandManager().addCommand(new ChangeElementCommand(mindMapView,boja,deblinaLinije));
        }

    }
}
