package gui.swing.controller;

import lombok.Getter;

@Getter
public class ActionManager {

    RemoveAction exitAction;
    InfoAction infoAction;
    NewAction newAction;
    EditAction editAction;
    AddElementAction addElementAction;
    ConnectElementAction connectElementAction;
    DragElementAction dragElementAction;
    RemoveElementAction removeElementAction;
    SelectElementAction selectElementAction;
    ZoomElementAction zoomElementAction;


    public ActionManager() {
        initActions();
    }

    private void initActions(){
        exitAction = new RemoveAction();
        infoAction = new InfoAction();
        newAction = new NewAction();
        editAction = new EditAction();

        addElementAction = new AddElementAction();
        connectElementAction = new ConnectElementAction();
        dragElementAction = new DragElementAction();
        removeElementAction = new RemoveElementAction();
        selectElementAction = new SelectElementAction();
        zoomElementAction = new ZoomElementAction();
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
