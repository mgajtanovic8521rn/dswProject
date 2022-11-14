package repository.composite;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;

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

    public abstract void removeChild(MapNode child);

    public MapNode getChildByName(String name) {
        for (MapNode child: this.getChildren()) {
            if (name.equals(child.getName())) {
                return child;
            }
        }
        return null;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        MapNode mapNode = null;
        if(subscriber instanceof MapNode) {
            mapNode = (MapNode)subscriber;
        }
        if(!children.contains(mapNode)){
            children.add(mapNode);
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        MapNode mapNode = null;
        if(subscriber instanceof MapNode) {
            mapNode = (MapNode) subscriber;
            children.remove(mapNode);
        }
    }

    @Override
    public void notifySubscribers(Object notification, ObserverMessage message) {
        for (MapNode mapNode:children) {
            if(mapNode instanceof Subscriber){
                ((Subscriber)mapNode).update(notification, message);
            }
        }
    }
}
