package gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;

public abstract class AbstractActionGeruMap extends AbstractAction {

    public Icon loadIcon(String fileName){

        URL imageURL = getClass().getResource(fileName);
        Icon icon = null;

        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }
        else {
            System.err.println("Resource not found: " + fileName);
        }
        return icon;
    }
}
