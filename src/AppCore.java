
public class AppCore {

    public static AppCore instance = null;

    private AppCore(){

    }

    public AppCore getInstance(){
        if(instance == null)
            instance = new AppCore();
        return instance;
    }
}
