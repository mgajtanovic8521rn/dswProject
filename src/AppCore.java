import core.AppFramework;
import core.Gui;
import gui.swing.controller.SwingGui;

public class AppCore extends AppFramework {

    public static AppCore instance = null;

    private AppCore(){

    }

    public static AppCore getInstance(){
        if(instance == null)
            instance = new AppCore();

        return instance;
    }

    public void run() { this.gui.start(); }

    public static void main(String[] args) {
        Gui gui = new SwingGui();
        AppFramework appFramework = AppCore.getInstance();
        appFramework.initialise(gui);
        appFramework.run();
    }
}
