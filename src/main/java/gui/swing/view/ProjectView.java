package gui.swing.view;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;
import repository.Implementation.MindMap;
import repository.Implementation.Project;
import repository.composite.MapNode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProjectView extends JPanel implements Subscriber {

    Project project;
    JLabel ime;
    JLabel autor;
    List<MindMapView> mindMapViewList;
    JTabbedPane tabbedPane;

    public ProjectView() {

        this.ime = new JLabel("Otvorite zeljeni projekat");
        tabbedPane = new JTabbedPane();
        autor = new JLabel("Nepoznat");
        mindMapViewList = new ArrayList<>();
        this.setLayout(new BorderLayout());
        this.add(ime,BorderLayout.NORTH);
        this.add(autor,BorderLayout.SOUTH);
        this.add(tabbedPane, BorderLayout.CENTER);
    }

    public void setProject(Project project) {

        if(this.project != null)
            this.project.removeSubscriber(this);

        this.project = project;
        project.addSubscriber(this);

        ime.setText(project.getName());
        tabbedPane.removeAll();

        if(mindMapViewList.size() != 0)
            for(MindMapView mindMapView : mindMapViewList){
                mindMapView.getMindMap().removeSubscriber(mindMapView);
            }

        mindMapViewList.clear();

        for(MapNode mapNode : project.getChildren()){
            MindMapView mindMapView = new MindMapView((MindMap) mapNode);
            mapNode.addSubscriber(mindMapView);
            mindMapViewList.add(mindMapView);
            tabbedPane.addTab(mapNode.getName(),mindMapView);

        }
    }

    @Override
    public void update(Object notification, observer.ObserverMessage message) {
        if(message.equals(ObserverMessage.PROMENJENO_IME)){
            if(notification instanceof MapNode)
                this.getIme().setText(((MapNode) notification).getName());
        }
    }
}
