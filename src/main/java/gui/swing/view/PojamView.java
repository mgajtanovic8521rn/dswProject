package gui.swing.view;

import lombok.Getter;
import lombok.Setter;
import observer.ObserverMessage;
import repository.Implementation.Pojam;

import java.awt.*;

@Getter
@Setter
public class PojamView extends ElementView{
    int X;
    int Y;
    int height;
    int width;
    Pojam pojam;
    int line;
    Color color;

    public PojamView(Pojam pojam) {
        X = pojam.getX();
        Y = pojam.getY();
        this.height = pojam.getHeight();
        this.pojam = pojam;
        this.width = 0;
        this.line = pojam.getDebljinaLinije();
        this.color = pojam.getColor();
    }

    public void paint(Graphics2D g){
        int textWidth = g.getFontMetrics().stringWidth(pojam.getName());
        this.width = textWidth;

        g.setPaint(new Color(color.getRed(), color.getBlue(), color.getGreen(), 100));
        g.fill(new Rectangle(X,Y,textWidth+10,height));
        g.setPaint(color);
        g.setStroke(new BasicStroke(line));
        g.drawRect(X,Y,textWidth+10,height);
        g.setPaint(Color.BLACK);
        g.drawString(pojam.getName(), X + 5, Y + height/2);
    }

    @Override
    public void update(Object notification, ObserverMessage message) {

    }
}
