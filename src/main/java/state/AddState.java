package state;

import core.ApplicationFramework;
import gui.swing.view.MainFrame;
import gui.swing.view.MindMapView;
import repository.Implementation.Pojam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class AddState extends State {

    private static int enumerator = 0;

    @Override
    public void misKliknut(MouseEvent e, MindMapView mindMapView) {
        JLabel labela = new JLabel("Unesite tekst");
        JLabel labelaLine = new JLabel("Unesite zeljenu deblinu linije (px)");
        JTextArea jTextArea = new JTextArea();
        JTextArea jTextAreaLine = new JTextArea();
        JColorChooser jColorChooser = new JColorChooser();
        jTextAreaLine.setText("2");
        JComponent[] komponente = new JComponent[]{
                labela,jTextArea,jColorChooser,labelaLine,jTextAreaLine
        };
        int result = JOptionPane.showConfirmDialog(MainFrame.getInstance(), komponente, "My custom dialog", JOptionPane.PLAIN_MESSAGE);
        Color boja = jColorChooser.getColor();
        String text = jTextArea.getText();
        int deblinaLinije = Integer.valueOf(jTextAreaLine.getText());
        if(result == JOptionPane.OK_OPTION)
            //mindMapView.getMindMap().addChild(new Pojam(text, mindMapView.getMindMap(), e.getX(), e.getY(), deblinaLinije, boja));
            MainFrame.getInstance().getMapTree().addElement(new Pojam(text, mindMapView.getMindMap(), e.getX(), e.getY(), deblinaLinije, boja), mindMapView.getMindMap());

    }

    @Override
    public void misPovucen(MouseEvent e, MindMapView mindMapView) {

    }

    @Override
    public void misOtpusten(MouseEvent e, MindMapView mindMapView) {

    }
}
