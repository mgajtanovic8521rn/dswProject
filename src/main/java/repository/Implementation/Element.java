package repository.Implementation;

import observer.ObserverMessage;
import observer.Subscriber;
import repository.composite.MapNode;

public class Element extends MapNode {


    public Element(String name, MapNode parent) {
        super(name, parent);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {

    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {

    }

    @Override
    public void notifySubscribers(Object notification, ObserverMessage message) {

    }
}
