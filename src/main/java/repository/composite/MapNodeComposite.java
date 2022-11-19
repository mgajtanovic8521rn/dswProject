package repository.composite;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;
import repository.Implementation.MindMap;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class MapNodeComposite extends MapNode{

    List<MapNode> children;


    public MapNodeComposite(String name, MapNode parent) {
        super(name, parent);
        this.children = new ArrayList<>();
    }


    public abstract void addChild(MapNode child);


    public MapNode getChildByName(String name) {
        for (MapNode child: this.getChildren()) {
            if (name.equals(child.getName())) {
                return child;
            }
        }
        return null;
    }

    public void removeChild(MapNode child) {
        if (child != null && child instanceof MindMap) {
            getChildren().remove(child);
        }
        notifySubscribers(this, ObserverMessage.OBRISANO_DETE);
    }


}
