package gui;

import javax.swing.*;

import gui.Creation.CreationWindow;
import gui.List.ListWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainWindow extends JFrame {

    private JDialog activeDialog = null;

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
            System.err.println("Erro carregando imagem: " + e.getMessage());
            layeredPane.setBackground(new Color(204, 204, 204));
        }
    }

    private void createButtons() {
        MedievalButton btNewChar = new MedievalButton("Criar Novo Personagem");
        MedievalButton btCharList = new MedievalButton("Listar Personagens");
        MedievalButton btExit = new MedievalButton("Sair");

        int buttonWidth = btNewChar.getPreferredSize().width + 40; // Tamanho

        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false);
        buttonPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10); // Padding dos botões

        btNewChar.setPreferredSize(new Dimension(buttonWidth, btNewChar.getPreferredSize().height));
        btCharList.setPreferredSize(new Dimension(buttonWidth, btCharList.getPreferredSize().height));
        btExit.setPreferredSize(new Dimension(buttonWidth, btExit.getPreferredSize().height));

        buttonPanel.add(btNewChar, gbc);

        gbc.gridy++;
        buttonPanel.add(btCharList, gbc);

        gbc.gridy++;
        gbc.insets = new Insets(50, 10, 10, 10);
        gbc.anchor = GridBagConstraints.PAGE_END;
        buttonPanel.add(btExit, gbc);

        JLayeredPane layeredPane = (JLayeredPane) getContentPane();
        layeredPane.setLayout(new BorderLayout());
        layeredPane.add(buttonPanel, BorderLayout.CENTER);        

        btNewChar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                manageActiveDialog();
                CreationWindow creationWindow = new CreationWindow();
                activeDialog = creationWindow;
                              
            }
        });

        btCharList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                manageActiveDialog();
                ListWindow listWindow = new ListWindow();
                activeDialog = listWindow;
                
            }
        });

        btExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    public void manageActiveDialog() {
        if (activeDialog != null) {
            activeDialog.dispose();
        }
    }
}