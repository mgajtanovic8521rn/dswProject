package gui.swing.controller;

public class ActionManager {

    RemoveAction exitAction;
    InfoAction infoAction;
    NewAction newAction;
    EditAction editAction;


    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction = new RemoveAction();
        infoAction = new InfoAction();
        newAction = new NewAction();
        editAction = new EditAction();
    }

    public EditAction getEditAction() {
        return editAction;
    }

    public RemoveAction getExitAction() {
        return exitAction;
    }

    public InfoAction getInfoAction() {
        return infoAction;
    }

    public NewAction getNewAction() {
        return newAction;
    }
}
