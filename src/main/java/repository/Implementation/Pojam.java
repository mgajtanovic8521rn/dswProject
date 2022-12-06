package repository.Implementation;

import lombok.Getter;
import lombok.Setter;
import repository.composite.MapNode;

import java.awt.*;

@Getter
@Setter
public class Pojam extends Element {

    int X;
    int Y;
    int height;


    public Pojam(String name, MapNode parent, int x, int y, int line, Color color) {
        super(name, parent, line, color);
        X = x;
        Y = y;
        this.height = 50;

    }

}
