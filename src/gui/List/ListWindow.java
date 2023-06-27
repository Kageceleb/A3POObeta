package gui.List;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MedievalButton;

public class ListWindow extends JDialog {

    JPanel contentBoxPanel = new JPanel();

    MedievalButton btView;
    MedievalButton btEdit;
    MedievalButton btLvlUp;
    MedievalButton btDel;
    MedievalButton btExit;

    
    
    public ListWindow() {   
        setTitle("Lista de Personagens");    
        initializeWindow();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initializeWindow() {
        setSize(700, 500);
        setResizable(false);

        btView = new MedievalButton("Visualizar");
        btView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        
        btEdit = new MedievalButton("Editar");
        btEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btLvlUp = new MedievalButton("Level Up");
        btLvlUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btDel = new MedievalButton("Excluir");
        btDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btExit = new MedievalButton("Voltar");
        btExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        btView.setPreferredSize(new Dimension(120, btView.getPreferredSize().height));
        btEdit.setPreferredSize(new Dimension(120, btEdit.getPreferredSize().height));
        btLvlUp.setPreferredSize(new Dimension(120, btLvlUp.getPreferredSize().height));
        btDel.setPreferredSize(new Dimension(120, btDel.getPreferredSize().height));
        btExit.setPreferredSize(new Dimension(120, btExit.getPreferredSize().height));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btView);
        buttonPanel.add(btEdit);
        buttonPanel.add(btLvlUp);
        buttonPanel.add(btDel);
        buttonPanel.add(btExit);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(contentBoxPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }
}
