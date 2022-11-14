package repository.Implementation;

import observer.ObserverMessage;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;

public class Project extends MapNodeComposite {


    public Project(String name, MapNode parent) {
        super(name, parent);
    }

    @Override
    public void addChild(MapNode child) {
        if (child != null &&  child instanceof MindMap){
            MindMap mindMap = (MindMap) child;
            if (!this.getChildren().contains(mindMap)){
                this.getChildren().add(mindMap);
            }
        }
        notifySubscribers(this, ObserverMessage.DODATO_DETE);
    }

    @Override
    public void removeChild(MapNode child) {
        if (child != null &&  child instanceof MindMap){
            getChildren().remove(child);
        }
        notifySubscribers(this, ObserverMessage.OBRISANO_DETE);
    }
}
