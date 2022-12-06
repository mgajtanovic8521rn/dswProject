package gui.swing.view;

import observer.ObserverMessage;
import observer.Subscriber;
import repository.Implementation.Veza;

import java.awt.*;

public class VezaView extends ElementView implements Subscriber {

    Veza veza;

    public VezaView(Veza veza) {
        this.veza = veza;
    }

    @Override
    public void update(Object notification, ObserverMessage message) {
        veza.getParent().notifySubscribers(this, ObserverMessage.PROMENJENA_POZICIJA);
    }

    @Override
    public void paint(Graphics2D g) {
        super.paint(g);
        g.setStroke(new BasicStroke(2));
        g.drawLine(veza.getXStart(), veza.getYStart(), veza.getXEnd(), veza.getYEnd());
    }
}
