import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DropDown extends JFrame {

    private JComboBox<String> dropdown;
    private JButton addButton;
    private List<String> options;

    public DropDown() {
        setTitle("Dynamic Dropdown Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize the options list
        options = new ArrayList<>();

        // Create the dropdown menu
        dropdown = new JComboBox<>();
        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) dropdown.getSelectedItem();
                System.out.println("Selected option: " + selectedOption);
            }
        });

        // Create the "Add" button
        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newOption = JOptionPane.showInputDialog(DropDown.this, "Enter a new option:");
                if (newOption != null && !newOption.isEmpty()) {
                    options.add(newOption);
                    updateDropdown();
                }
            }
        });

        // Create a panel to hold the dropdown and the button
        JPanel panel = new JPanel();
        panel.add(dropdown);
        panel.add(addButton);

        // Add the panel to the JFrame
        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateDropdown() {
        dropdown.removeAllItems();
        for (String option : options) {
            dropdown.addItem(option);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DropDown::new);
    }
}
