package gui.swing.view;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static MainFrame instance = null;

    public MainFrame(){

    }

    private void init(){

        ///osnovna podesavanja porozora
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        this.setSize(screenSize.width/2, screenSize.height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }


    public static MainFrame getInstance() {
        if(instance == null){
            instance = new MainFrame();
            instance.init();
        }
        return instance;
    }


}
