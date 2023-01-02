package gui.swing.controller;

import gui.swing.command.implementation.RemoveElementCommand;
import gui.swing.view.MainFrame;
import gui.swing.view.MindMapView;

import java.awt.event.ActionEvent;

public class RemoveElementAction extends AbstractActionGeruMap{

    public RemoveElementAction() {
        putValue(SMALL_ICON,loadIcon("/images/removeElement.png"));
        putValue(NAME,"Remove Element");
        putValue(SHORT_DESCRIPTION,"Remove Element");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MindMapView mindMapView = MainFrame.getInstance().getProjectView().getActiveMindMap();
        if(mindMapView != null)
            MainFrame.getInstance().getCommandManager().addCommand(new RemoveElementCommand(mindMapView.getMindMap(), mindMapView.getSelectedPojamList(), mindMapView.getSelectedVezaList()));
    }
}
