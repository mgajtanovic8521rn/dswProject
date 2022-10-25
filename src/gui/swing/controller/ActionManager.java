package gui.swing.controller;

public class ActionManager {

    ExitAction exitAction;
    InfoAction infoAction;
    NewAction newAction;


    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction = new ExitAction();
        infoAction = new InfoAction();
        newAction = new NewAction();
    }

    public ExitAction getExitAction() {
        return exitAction;
    }

    public InfoAction getInfoAction() {
        return infoAction;
    }

    public NewAction getNewAction() {
        return newAction;
    }
}
