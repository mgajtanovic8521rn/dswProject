package gui.swing.view;

import observer.ObserverMessage;
import observer.Subscriber;

import java.awt.*;

public class ElementView implements Subscriber {
    public void paint(Graphics2D g){
        System.out.println("Element");
    }

    @Override
    public void update(Object notification, ObserverMessage message) {

    }
}
