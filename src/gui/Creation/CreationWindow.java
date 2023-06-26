package gui.Creation;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MedievalButton;
import gui.Creation.Panels.*;

public class CreationWindow extends JDialog {

    private JPanel contentPanel;
    private MedievalButton button1;
    private MedievalButton button2;

    public CreationWindow() {
        setTitle("Criar Novo Personagem");
        initializeWindow();
        updateWindow();
        setVisible(true);
    }

    private void initializeWindow() {
        contentPanel = new BeginPanel();
        // Add components to the content panel

        button1 = new MedievalButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (contentPanel instanceof BeginPanel) {
                    // Perform action for PanelClass1
                    
                } else if (contentPanel instanceof BGPanel) {

                } else if (contentPanel instanceof RacePanel) {

                } else if (contentPanel instanceof Message1Panel) {

                } else if (contentPanel instanceof ClassyPanel) {

                } else if (contentPanel instanceof AttributesPanel) {

                } else if (contentPanel instanceof AlignmentPanel) {

                } else if (contentPanel instanceof NamesPanel) {

                } 
            }
        });

        button2 = new MedievalButton("Button 2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (contentPanel instanceof BeginPanel) {
                    // Perform action for PanelClass1
                    
                } else if (contentPanel instanceof BGPanel) {

                } else if (contentPanel instanceof RacePanel) {

                } else if (contentPanel instanceof Message1Panel) {

                } else if (contentPanel instanceof ClassyPanel) {

                } else if (contentPanel instanceof AttributesPanel) {

                } else if (contentPanel instanceof AlignmentPanel) {

                } else if (contentPanel instanceof NamesPanel) {

                } 
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setPreferredSize(new Dimension(700, 500));
        setResizable(false);
        pack();
    }

    private void updateWindow() {
        if (contentPanel instanceof BeginPanel) {
            button1.setText("Começar!");
            button2.setText("Cancelar");

        } else if (contentPanel instanceof BGPanel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof RacePanel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof Message1Panel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof ClassyPanel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof AttributesPanel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof AlignmentPanel) {
            button1.setText("Próximo");
            button2.setText("Voltar");

        } else if (contentPanel instanceof NamesPanel) {
            button1.setText("Finalizar");
            button2.setText("Voltar");

        } 
    }
}
