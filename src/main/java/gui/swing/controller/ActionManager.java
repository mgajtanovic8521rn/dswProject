package gui.swing.controller;

public class ActionManager {

    ExitAction exitAction;
    InfoAction infoAction;
    NewAction newAction;

    EditAction editAction;


    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction = new ExitAction();
        infoAction = new InfoAction();
        newAction = new NewAction();
        editAction = new EditAction();
    }

    public EditAction getEditAction() {
        return editAction;
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
