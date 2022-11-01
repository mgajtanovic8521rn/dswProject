package gui.swing.view;

import gui.swing.controller.ActionManager;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static MainFrame instance = null;

    ActionManager actionManager;
    ToolBar toolBar;
    MyMenuBar myMenuBar;

    public MainFrame(){

    }


    private void init(){

        actionManager = new ActionManager();
        initialiseGUI();

    }

    private void initialiseGUI(){
        ///osnovna podesavanja porozora
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width/2, screenSize.height/2);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GeRuMap application");

        myMenuBar = new MyMenuBar();
        this.setJMenuBar(myMenuBar);

        toolBar = new ToolBar();
        this.add(toolBar,BorderLayout.NORTH);

        JPanel panel = new JPanel();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setMinimumSize(new Dimension(200,150));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPane,panel);
        getContentPane().add(splitPane,BorderLayout.CENTER);
        splitPane.setDividerLocation(250);
        splitPane.setOneTouchExpandable(true);
    }


    public static MainFrame getInstance() {
        if(instance == null){
            instance = new MainFrame();
            instance.init();
        }
        return instance;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public void setActionManager(ActionManager actionManager) {
        this.actionManager = actionManager;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }

    public void setToolBar(ToolBar toolBar) {
        this.toolBar = toolBar;
    }




   // public MyMenuBar getMenuBar() {
    //    return myMenuBar;
   // }

    public void setMenuBar(MyMenuBar myMenuBar) {
        this.myMenuBar = myMenuBar;
    }
}
