package gui.Creation.Panels;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlignmentPanel extends JPanel {

    JTextField alignmenNumber = new JTextField();

    public AlignmentPanel() {
        add(alignmenNumber);
    }
    
    public int getAlignmentNumber() {
        return 0;
    }
}