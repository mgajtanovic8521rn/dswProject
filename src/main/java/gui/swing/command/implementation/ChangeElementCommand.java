package gui.swing.command.implementation;

import gui.swing.command.AbstractCommand;
import gui.swing.view.MindMapView;
import gui.swing.view.PojamView;
import gui.swing.view.VezaView;
import repository.Implementation.Veza;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChangeElementCommand extends AbstractCommand {
    MindMapView mindMapView;
    Color boja;
    int deblinaLinije;

    List<Color> oldColorsPojam;
    List<Integer> oldLinesPojam;
    List<Color> oldColorsVeza;
    List<Integer> oldLinesVeza;


    public ChangeElementCommand(MindMapView mindMapView, Color boja, int deblinaLinije) {
        this.mindMapView = mindMapView;
        this.boja = boja;
        this.deblinaLinije = deblinaLinije;
        oldColorsPojam = new ArrayList<>();
        oldLinesPojam = new ArrayList<>();
        oldColorsVeza = new ArrayList<>();
        oldLinesVeza = new ArrayList<>();
    }

    @Override
    public void doCommand() {

        for(PojamView pojamView : mindMapView.getSelectedPojamList()){
            oldColorsPojam.add(pojamView.getColor());
            pojamView.getPojam().setColor(boja);
            oldLinesPojam.add(pojamView.getLine());
            pojamView.getPojam().setDebljinaLinije(deblinaLinije);
        }
        for(VezaView vezaView : mindMapView.getSelectedVezaList()){
            oldColorsVeza.add(vezaView.getVeza().getColor());
            vezaView.getVeza().setColor(boja);
            oldLinesVeza.add(vezaView.getLine());
            vezaView.getVeza().setDebljinaLinije(deblinaLinije);
        }
    }

    @Override
    public void undoCommand() {
        int i = 0;
        for(PojamView pojamView : mindMapView.getSelectedPojamList()){
            pojamView.getPojam().setColor(oldColorsPojam.get(i));
            pojamView.getPojam().setDebljinaLinije(oldLinesPojam.get(i));
            i++;
        }
        i = 0;
        for(VezaView vezaView : mindMapView.getSelectedVezaList()){
            vezaView.getVeza().setColor(oldColorsVeza.get(i));
            vezaView.getVeza().setDebljinaLinije(oldLinesVeza.get(i));
            i++;
        }
    }
}
