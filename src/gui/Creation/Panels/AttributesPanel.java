package gui.Creation.Panels;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class AttributesPanel extends JPanel {
    private int remainingPoints;
    private JSpinner[] attributeSpinners;

    public AttributesPanel() {
        setLayout(new GridLayout(6, 2));
        remainingPoints = 27;
        attributeSpinners = new JSpinner[6];

        for (int i = 0; i < 6; i++) {
            JLabel label = new JLabel("Attribute " + (i + 1) + ":");
            JSpinner spinner = new JSpinner(new SpinnerNumberModel(8, 8, 15, 1));
            attributeSpinners[i] = spinner;

            spinner.addChangeListener(new AttributeChangeListener(i));

            add(label);
            add(spinner);
        }
    }

    private class AttributeChangeListener implements ChangeListener {
        private final int index;
        private int previousValue;

        public AttributeChangeListener(int index) {
            this.index = index;
            this.previousValue = (int) attributeSpinners[index].getValue();
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            JSpinner spinner = (JSpinner) e.getSource();
            int newValue = (int) spinner.getValue();
            int difference = newValue - previousValue;

            if (difference > 0 && remainingPoints < difference) {
                JOptionPane.showMessageDialog(
                        AttributesPanel.this,
                        "Not enough points remaining.",
                        "Point Allocation",
                        JOptionPane.ERROR_MESSAGE
                );
                spinner.setValue(previousValue);
                return;
            }

            remainingPoints -= difference;
            previousValue = newValue;

            spinner.setEnabled(remainingPoints > 0);
        }
    }



    public int[] getAttributes() {
        int[] attributes = new int[6];
        for (int i = 0; i < 6; i++) {
            attributes[i] = (int) attributeSpinners[i].getValue();
        }
        return attributes;
    }
}
