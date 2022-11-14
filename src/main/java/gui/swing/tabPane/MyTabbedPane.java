package gui.swing.tabPane;

import javax.swing.*;
import java.awt.*;

public class MyTabbedPane extends JTabbedPane {

    public MyTabbedPane() {
        super();
    }

    @Override
    public void addTab(String title, Icon icon,Component component,String tip) {
        super.addTab(title,icon,component,tip);
    }

    @Override
    public void addTab(String title, Icon icon, Component component) {
        super.addTab(title, icon, component);
    }
}
