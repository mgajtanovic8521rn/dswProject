package core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter

@Setter
public class ApplicationFramework {

    protected Gui gui;
    protected MapRepository mapRepository;

    public void run(){
        this.gui.start();
    }

    public ApplicationFramework() {

    }

    public void initialise(Gui gui,MapRepository mapRepository){
        this.gui = gui;
        this.mapRepository = mapRepository;
    }
    private static ApplicationFramework instance;

    public static ApplicationFramework getInstance(){
        if(instance==null){
            instance = new ApplicationFramework();
        }
        return instance;
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }
}
