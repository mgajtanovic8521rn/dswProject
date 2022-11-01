package gui.swing.controller;

import core.Gui;
import gui.swing.view.MainFrame;

public class SwingGui implements Gui {

    MainFrame mainFrame;
    @Override
    public void start() {
        mainFrame = MainFrame.getInstance();
        mainFrame.setVisible(true);
    }
}
