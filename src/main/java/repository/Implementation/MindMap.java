package repository.Implementation;

import observer.ObserverMessage;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;

public class MindMap extends MapNodeComposite {

    public MindMap(String name, MapNode parent) {
        super(name, parent);
    }

    @Override
    public void addChild(MapNode child) {
        if (child != null &&  child instanceof Element){
            Element element = (Element) child;
            if (!this.getChildren().contains(element)){
                this.getChildren().add(element);
            }
        }
        notifySubscribers(this, ObserverMessage.DODATO_DETE);
    }

}
