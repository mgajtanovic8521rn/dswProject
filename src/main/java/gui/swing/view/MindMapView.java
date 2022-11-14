package gui.swing.view;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;
import repository.Implementation.MindMap;

import javax.swing.*;


@Getter
@Setter
public class MindMapView extends JPanel implements Subscriber {

    MindMap mindMap;

    JLabel ime;


    public MindMapView(MindMap mindMap) {
        this.mindMap = mindMap;

        ime = new JLabel();


        ime.setText(mindMap.getName());


    }

    @Override
    public void update(Object notification, ObserverMessage message) {

    }
}
