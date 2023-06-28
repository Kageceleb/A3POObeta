package gui.Creation.Panels;

import javax.swing.*;

import logic.Interfaces.Background;
import tools.BGList;

import java.awt.*;
import java.util.ArrayList;

public class BGPanel extends JPanel {

    private JLabel titleLabel;
    JList<String> backgroundList;

    public BGPanel() {
        setLayout(new GridBagLayout());

        setPreferredSize(new Dimension(680, 400));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
    
        JPanel leftPanel = new JPanel(new BorderLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;
        add(leftPanel, gbc);

        BGList bgList = new BGList();

        ArrayList<Background> bgItems = bgList.getBGList();
        String[] bgStrings = new String[13];

        for (int i = 0; i<bgStrings.length; i ++) {
            bgStrings[i] = bgItems.get(i).getBGName();
        }

        JList<String> backgroundList = new JList<>(bgStrings);
        
        JScrollPane scrollPane = new JScrollPane(backgroundList);
        leftPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel rightPanel = new JPanel(new BorderLayout());
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 2;
        add(rightPanel, gbc);

        JPanel titlePanel = new JPanel();
        titleLabel = new JLabel("Descrição do Antecedente");
        titlePanel.add(titleLabel);
        rightPanel.add(titlePanel, BorderLayout.NORTH);

        JPanel contentPanel = new JPanel(new GridLayout(3, 1));
        JTextArea txtDesc = new JTextArea();
        JTextArea txtSkills = new JTextArea();
        JTextArea txtItems = new JTextArea();
        txtDesc.setEditable(false);
        txtSkills.setEditable(false);
        txtItems.setEditable(false);

        txtDesc.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Descrição"));
        txtSkills.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Habilidades"));
        txtItems.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Itens Iniciais"));

        contentPanel.add(txtDesc);
        contentPanel.add(txtSkills);
        contentPanel.add(txtItems);
        rightPanel.add(contentPanel, BorderLayout.CENTER);

        backgroundList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = backgroundList.getSelectedIndex();
                if (selectedIndex >= 0 && selectedIndex < bgStrings.length) {
                    titleLabel.setText(bgItems.get(selectedIndex).getBGName());
                    txtDesc.setText(bgItems.get(selectedIndex).getBGDescription());
                    txtSkills.setText(bgItems.get(selectedIndex).getBGBonuses());
                    txtItems.setText(bgItems.get(selectedIndex).getBGItems());
                }
            }
        });

        if (backgroundList.isSelectionEmpty()) {
            backgroundList.setSelectedIndex(0);
        }
    }

    public int getBGNumber() {
        return (backgroundList.getSelectedIndex()+1);
    }
}
