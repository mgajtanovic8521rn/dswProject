package core;

public abstract class AppFramework{

    protected Gui gui;

    public abstract void run();

    public AppFramework() {

    }

    public void initialise(Gui gui){

        this.gui = gui;
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }
}
