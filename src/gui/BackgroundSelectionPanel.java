package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import logic.Backgrounds.*;

import logic.Interfaces.Background;

public class BackgroundSelectionPanel extends JPanel {

    private Background[] backgrounds = {
            new Acolyte(), new Charlatan(), new Criminal(), new Entertainer(),
             new FolkHero(), new GuildArtisan(), new Hermit(), new Noble(), new Outlander(),
             new Sage(), new Sailor(), new Soldier(), new Urchin()
    };
    private int currentIndex = 0;

    private JLabel nameLabel;
    private JLabel descriptionLabel;
    private JLabel itemsLabel;
    private JLabel bonusesLabel;

    public BackgroundSelectionPanel() {
        setLayout(new BorderLayout());

        JButton previousButton = new JButton("Previous");
        previousButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                previousBackground();
            }
        });

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextBackground();
            }
        });

        nameLabel = new JLabel();
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        descriptionLabel = new JLabel();
        descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        itemsLabel = new JLabel();
        itemsLabel.setHorizontalAlignment(SwingConstants.CENTER);

        bonusesLabel = new JLabel();
        bonusesLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton chooseButton = new JButton("Choose");
        chooseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseBackground();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);

        JPanel centerPanel = new JPanel(new GridLayout(5, 1));
        centerPanel.add(nameLabel);
        centerPanel.add(descriptionLabel);
        centerPanel.add(itemsLabel);
        centerPanel.add(bonusesLabel);
        centerPanel.add(chooseButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        updateFields();
    }

    private void previousBackground() {
        currentIndex = (currentIndex - 1 + backgrounds.length) % backgrounds.length;
        updateFields();
    }

    private void nextBackground() {
        currentIndex = (currentIndex + 1) % backgrounds.length;
        updateFields();
    }

    private void updateFields() {
        Background currentBackground = backgrounds[currentIndex];
        nameLabel.setText(currentBackground.getBGName());
        descriptionLabel.setText(currentBackground.getBGDescription());
        itemsLabel.setText(currentBackground.getBGItems());
        bonusesLabel.setText(currentBackground.getBGBonuses());
    }

    private void chooseBackground() {
        Background selectedBackground = backgrounds[currentIndex];
        // Do something with the selected background
        System.out.println("Selected Background: " + selectedBackground.getBGName());
    }

}
