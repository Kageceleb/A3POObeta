package gui.List;

import javax.swing.*;

public class ListWindow extends JDialog {

    public ListWindow(JFrame parent) {
        super(parent, "Listar Personagens", true);
        setLocationRelativeTo(parent);
        initializeWindow();
    }
    
    private void initializeWindow() {
        setSize(700, 500);
        setResizable(false);
        
    }
}
