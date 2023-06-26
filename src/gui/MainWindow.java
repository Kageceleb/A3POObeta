package gui;

import javax.swing.*;

import gui.Creation.CreationWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class MainWindow extends JFrame {

    public MainWindow() {
        initializeWindow();
        createButtons();
    }

    private void initializeWindow() {
        setTitle("| D&D | Criador de Personagens");
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 600));
        setContentPane(layeredPane);

        try {
            String imagePath = getClass().getResource("/gui/images/background.jpg").getPath();
            File imageFile = new File(imagePath);
            if (imageFile.exists()) {
                ImageIcon imageIcon = new ImageIcon(imagePath);
                JLabel backgroundLabel = new JLabel(imageIcon);
                backgroundLabel.setBounds(0, 0, 800, 600);
                layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
            } else {
                layeredPane.setBackground(new Color(204, 204, 204));
            }
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
            layeredPane.setBackground(new Color(204, 204, 204));
        }
    }

    private void createButtons() {
        MedievalButton button1 = new MedievalButton("Criar Novo Personagem");
        MedievalButton button2 = new MedievalButton("Listar Personagens");
        MedievalButton button3 = new MedievalButton("Sair");

        int buttonWidth = button1.getPreferredSize().width + 40; // Tamanho

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Padding dos botões

        button1.setPreferredSize(new Dimension(buttonWidth, button1.getPreferredSize().height));
        button2.setPreferredSize(new Dimension(buttonWidth, button2.getPreferredSize().height));
        button3.setPreferredSize(new Dimension(buttonWidth, button3.getPreferredSize().height));

        buttonPanel.add(button1, gbc);

        gbc.gridy++;
        buttonPanel.add(button2, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(50, 10, 10, 10);
        gbc.anchor = GridBagConstraints.PAGE_END;
        buttonPanel.add(button3, gbc);

        JLayeredPane layeredPane = (JLayeredPane) getContentPane();
        layeredPane.setLayout(new BorderLayout());
        layeredPane.add(buttonPanel, BorderLayout.CENTER);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreationWindow creationWindow = new CreationWindow();
                creationWindow.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        
                    }
                });
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }
}