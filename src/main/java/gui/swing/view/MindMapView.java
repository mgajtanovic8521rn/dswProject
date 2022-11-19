package gui.swing.view;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;
import repository.Implementation.MindMap;
import repository.composite.MapNode;

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
        if(message.equals(ObserverMessage.PROMENJENO_IME)){
            if(notification instanceof MapNode){
                int index = MainFrame.getInstance().getProjectView().getTabbedPane().indexOfComponent(this);
                MainFrame.getInstance().getProjectView().getTabbedPane().setTitleAt(index, ((MapNode)notification).getName());
            }

        }
    }
}
