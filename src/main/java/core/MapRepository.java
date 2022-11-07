package core;

import repository.Implementation.ProjectExplorer;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;

import java.nio.channels.FileChannel;

public interface MapRepository {
    ProjectExplorer getProjectExplorer();
    void addChild(MapNodeComposite parent, MapNode child);
}
