package repository;

import core.MapRepository;
import lombok.Getter;
import lombok.Setter;
import repository.Implementation.ProjectExplorer;
import repository.composite.MapNode;
import repository.composite.MapNodeComposite;

@Setter
@Getter
public class MapRepositoryImpl implements MapRepository {
    private ProjectExplorer projectExplorer;

    public MapRepositoryImpl() {
        projectExplorer = new ProjectExplorer("My Project Explorer");
    }

    public ProjectExplorer getProjectExplorer() {
        return projectExplorer;
    }

    @Override
    public void addChild(MapNodeComposite parent, MapNode child) {

    }
}
