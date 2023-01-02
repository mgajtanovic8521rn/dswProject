package serializer;

import com.google.gson.Gson;
import repository.Implementation.Project;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Serializer {
    private final Gson gson = new Gson();

    public Project loadProject(File file) {
        try (FileReader fileReader = new FileReader(file)) {
            return gson.fromJson(fileReader, Project.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveProject(Project project) {
        System.out.println(gson.toJson(project));
        try (FileWriter writer = new FileWriter(project.getFilePath())) {
            System.out.println("Uso jesam ja");
            gson.toJson(project, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
