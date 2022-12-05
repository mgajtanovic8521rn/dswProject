package repository.Implementation;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import observer.Subscriber;
import repository.composite.MapNode;

@Getter
@Setter

public class Element extends MapNode {

    private int debljinaLinije;

    public Element(String name, MapNode parent) {
        super(name, parent);
        debljinaLinije = 2;
    }

    public Element(String name, MapNode parent, int debljinaLinije) {
        super(name, parent);
        this.debljinaLinije = debljinaLinije;
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
