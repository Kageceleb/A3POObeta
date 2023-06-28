package gui.Creation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MedievalButton;
import gui.Creation.Panels.*;
import logic.LogicCharacter;
import repository.CharacterRepository;

public class CreationWindow extends JDialog {

    private JPanel contentBoxPanel = new JPanel();

    private JPanel contentPanel;
    private MedievalButton button1;
    private MedievalButton button2;

    private BGPanel bgPanel = new BGPanel();
    private RacePanel racePanel = new RacePanel();
    private ClassyPanel classyPanel = new ClassyPanel();
    private AttributesPanel attributesPanel =  new AttributesPanel();
    private AlignmentPanel alignmentPanel = new AlignmentPanel();
    private NamesPanel namesPanel =  new NamesPanel();

    public CreationWindow() {
        setTitle("Criar Novo Personagem");
        initializeWindow();
        setLocationRelativeTo(null);
        updateWindow();
        setVisible(true);
    }

    private void initializeWindow() {
        contentPanel = new BeginPanel();
        
        button1 = new MedievalButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (contentPanel instanceof BeginPanel) {
                    dispose();

                } else if (contentPanel instanceof BGPanel) {
                    contentPanel = new BeginPanel();

                } else if (contentPanel instanceof RacePanel) {
                    contentPanel = bgPanel;

                } else if (contentPanel instanceof Message1Panel) {
                    contentPanel = racePanel;

                } else if (contentPanel instanceof ClassyPanel) {
                    contentPanel = new Message1Panel();

                } else if (contentPanel instanceof AttributesPanel) {
                    contentPanel = classyPanel;
                    
                } else if (contentPanel instanceof AlignmentPanel) {
                    contentPanel = attributesPanel;

                } else if (contentPanel instanceof NamesPanel) {
                    contentPanel = alignmentPanel;

                }

                updateWindow();
            }
        });

        button2 = new MedievalButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (contentPanel instanceof BeginPanel) {
                    contentPanel = bgPanel;
                    
                } else if (contentPanel instanceof BGPanel) {
                    contentPanel = racePanel;

                } else if (contentPanel instanceof RacePanel) {
                    contentPanel = new Message1Panel();

                } else if (contentPanel instanceof Message1Panel) {
                    contentPanel = classyPanel;

                } else if (contentPanel instanceof ClassyPanel) {
                    contentPanel = attributesPanel;

                } else if (contentPanel instanceof AttributesPanel) {
                    contentPanel = alignmentPanel;
                    
                } else if (contentPanel instanceof AlignmentPanel) {
                    contentPanel = namesPanel;
                    
                } else if (contentPanel instanceof NamesPanel) { 
                    
                    
                } 

                updateWindow();
            }
        });

        button1.setPreferredSize(new Dimension(150, button1.getPreferredSize().height));
        button2.setPreferredSize(new Dimension(150, button2.getPreferredSize().height));

        JPanel buttonPanel = new JPanel();       
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contentBoxPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        contentBoxPanel.add(contentPanel);
        // contentBoxPanel.setBackground(Color.BLUE); //Cor teste para verificar preenchimento

        setPreferredSize(new Dimension(700, 500));
        setResizable(false);
        pack();
    }

    private void updateWindow() {

        if (contentPanel instanceof BeginPanel) {
            button1.setText("Cancelar");
            button2.setText("Começar!");

        } else if (contentPanel instanceof BGPanel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof RacePanel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof Message1Panel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof ClassyPanel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof AttributesPanel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof AlignmentPanel) {
            button1.setText("Voltar");
            button2.setText("Próximo");

        } else if (contentPanel instanceof NamesPanel) {
            button1.setText("Voltar");
            button2.setText("Finalizar");
        }

        contentBoxPanel.removeAll();
        contentBoxPanel.add(contentPanel);
        contentBoxPanel.revalidate();
        contentBoxPanel.repaint();
    }


    // Apenas utilizar após validação completa
    private void createCharacter() {
        CharacterRepository cr = new CharacterRepository();

        String name = namesPanel.getCharName();
        String player = namesPanel.getPlayerName();
        int alignment = alignmentPanel.getAlignmentNumber();
        int[] attributes = attributesPanel.getAttributes();
        int race = racePanel.getRaceNumber();
        int classy = classyPanel.getClassNumber();
        int bg = bgPanel.getBGNumber();

        LogicCharacter newChar = new LogicCharacter(0, name, player, alignment, attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], 1, race, classy, bg);
            
        cr.create(newChar);
    }
}
