package gui.swing.view;

import javax.swing.*;

public class ToolBar extends JToolBar {

    public ToolBar() {
        initializeComponents();
    }

    private void initializeComponents(){

        setFloatable(false);

        this.add(MainFrame.getInstance().getActionManager().getNewAction());
        this.add(MainFrame.getInstance().getActionManager().getInfoAction());
        this.add(MainFrame.getInstance().getActionManager().getExitAction());
        this.add(MainFrame.getInstance().getActionManager().getEditAction());
    }

}
