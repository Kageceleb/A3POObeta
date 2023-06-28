package gui.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.MedievalButton;
import logic.LogicCharacter;
import repository.CharacterRepository;

public class ListWindow extends JDialog {

    CharacterRepository cr = new CharacterRepository();

    JTable characterTable;

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

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[] {"ID", "Nome", "Raça", "Classe", "Nível","Jogador"});

        for (LogicCharacter character : cr.list()) {
            Object[] rowData = {character.getId(), character.getName(), character.getRace().getRaceName(), character.getClassy().getClassName(), character.getLevel(), character.getPlayer()};
            model.addRow(rowData);
        }

        characterTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(characterTable);

        btView = new MedievalButton("Visualizar");
        btView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = characterTable.getSelectedRow();
                
                if (selectedRow != -1) {
                    Object selectedValue = characterTable.getValueAt(selectedRow, 0);

                    if (selectedValue instanceof Number) {
                        int characterId = ((Number) selectedValue).intValue();

                        for (LogicCharacter character : cr.list()) {
                            if (character.getId() == characterId) {
                                new ViewSheet(character);
                                break;
                            }
                        }
                    }
                }
            }
        });
        
        btEdit = new MedievalButton("Editar");
        btEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = characterTable.getSelectedRow();

                if (selectedRow != -1) {
                    Object selectedValue = characterTable.getValueAt(selectedRow, 0);

                    if (selectedValue instanceof Number) {
                        int characterId = ((Number) selectedValue).intValue();

                        for (LogicCharacter character : cr.list()) {
                            if (character.getId() == characterId) {
                                
                                break;
                            }
                        }
                    }

                    refreshTable();
                }
            }
        });

        btLvlUp = new MedievalButton("Level Up");
        btLvlUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = characterTable.getSelectedRow();
                boolean validated = false;
                LogicCharacter lvlupChar = new LogicCharacter(0, null, null, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1);

                if (selectedRow != -1) {
                    Object selectedValue = characterTable.getValueAt(selectedRow, 0);

                    if (selectedValue instanceof Number) {
                        int characterId = ((Number) selectedValue).intValue();

                        for (LogicCharacter character : cr.list()) {
                            if (character.getId() == characterId) {
                                lvlupChar = character;
                                validated = true;
                                break;
                            }
                        }

                        if (validated) {
                            int nextLevel = lvlupChar.getLevel()+1;

                            if (nextLevel > 20) {
                                JOptionPane.showMessageDialog(null, lvlupChar.getName() + " chegou ao limite da sua jornada. Já é um lenda!", "Atenção aventureiro!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                int choice = JOptionPane.showOptionDialog(null,lvlupChar.getName() + " será promovido ao nível " + nextLevel,"Confirmação",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new String[]{"Sim", "Não"},"Sim");
                                
                                if (choice == JOptionPane.YES_OPTION) {
                                    lvlupChar.setLevel(nextLevel);
                                    cr.update(lvlupChar.getId(), lvlupChar);                                   
                                   
                                } else if (choice == JOptionPane.NO_OPTION) {
                                    
                                }

                            }
                        }
                    }
                                       
                    refreshTable();
                }
            }
        });

        btDel = new MedievalButton("Excluir");
        btDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = characterTable.getSelectedRow();
                if (selectedRow != -1) {
                    
                    refreshTable();
                }
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
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public void updateTable(DefaultTableModel model) {
        model.setRowCount(0);

        for (LogicCharacter character : cr.list()) {
            Object[] rowData = {character.getName(), character.getRace().getRaceName(), character.getClassy().getClassName(), character.getLevel(), character.getPlayer()};
            model.addRow(rowData);
        }
    }

    public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) characterTable.getModel();
        updateTable(model);
    }
}
