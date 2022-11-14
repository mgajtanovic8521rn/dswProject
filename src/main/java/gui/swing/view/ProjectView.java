package gui.swing.view;

import lombok.Getter;
import lombok.Setter;
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

        this.project = project;
        ime.setText(project.getName());
        mindMapViewList.clear();
        tabbedPane.removeAll();

        for(MapNode mapNode : project.getChildren()){
            MindMapView mindMapView = new MindMapView((MindMap) mapNode);
            mindMapViewList.add(mindMapView);
            tabbedPane.addTab(mapNode.getName(),mindMapView);

        }
    }

    @Override
    public void update(Object notification, observer.ObserverMessage message) {

    }
}
