package gui.swing.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ExitAction extends AbstractActionGeruMap {



    public ExitAction() {
        putValue(SMALL_ICON,loadIcon("/images/exitIcon.png"));
        putValue(NAME,"Exit");
        putValue(SHORT_DESCRIPTION,"Exit");

    }


    @Override
    public void actionPerformed(ActionEvent e) {
            System.exit(0);
    }
}
