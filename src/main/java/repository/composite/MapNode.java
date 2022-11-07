package repository.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public abstract class MapNode {
    private String name;
    @ToString.Exclude
    private MapNode parent;

    public MapNode(String name, MapNode parent) {
        this.name = name;
        this.parent = parent;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof MapNode) {
            MapNode otherObj = (MapNode) obj;
            return this.getName().equals(otherObj.getName());
        }
        return false;
    }
}
