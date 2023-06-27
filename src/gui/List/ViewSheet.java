package gui.List;

import javax.swing.*;

public class ViewSheet extends JDialog{
    
    public ViewSheet(String name) {
        setTitle("Ficha de " + name);    
        initializeWindow();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initializeWindow() {
        setSize(700, 700);
        setResizable(false);
    }
}
