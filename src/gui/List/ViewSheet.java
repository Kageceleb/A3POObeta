package gui.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.util.ArrayList;

import logic.LogicCharacter;

public class ViewSheet extends JDialog{

    public ViewSheet(LogicCharacter character) {
        setLayout(new BorderLayout());
        setSize(740,700);
        setResizable(false);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JPanel headerPanel = createHeaderPanel(character);
        contentPanel.add(headerPanel);

        JPanel attributesPanel = createAttributesPanel(character);
        contentPanel.add(attributesPanel);

        JPanel combatPanel = createCombatPanel(character);
        contentPanel.add(combatPanel);

        JPanel skillsPanel = createSkillsPanel(character);
        contentPanel.add(skillsPanel);

        JPanel inventoryPanel = createInventoryPanel(character);
        contentPanel.add(inventoryPanel);

        JPanel spellsPanel = createSpellsPanel(character);
        contentPanel.add(spellsPanel);

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        add(scrollPane, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createHeaderPanel(LogicCharacter character) {
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setPreferredSize(new Dimension(700, 50));

        JLabel nameLabel = new JLabel("Nome do personagem: " + character.getName());
        JLabel playerLabel = new JLabel("Jogador: " + character.getPlayer());
        JLabel raceLabel = new JLabel("Raça: " + character.getRace().getRaceName());
        JLabel classLabel = new JLabel("Classe: " + character.getClassy().getClassName());
        JLabel levelLabel = new JLabel("Nível: " + character.getLevel());
        JLabel alignLabel = new JLabel("Alinhamento: " + character.getAlignment());
        JLabel bgLabel = new JLabel("Antecendente: " + character.getBackground());

        nameLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 150));
        playerLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 150));
        raceLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
        classLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
        levelLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));
        alignLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 50));

        headerPanel.add(nameLabel);
        headerPanel.add(playerLabel);
        headerPanel.add(raceLabel);
        headerPanel.add(classLabel);
        headerPanel.add(levelLabel);
        headerPanel.add(alignLabel);
        headerPanel.add(bgLabel);

        return headerPanel;
    }

    private JPanel createAttributesPanel(LogicCharacter character) {
        JPanel attributesPanel = new JPanel(new GridLayout(2, 6));
        attributesPanel.setPreferredSize(new Dimension(700, 80));

        JLabel strMainLabel = new JLabel("FOR " + character.getStrMain());
        JLabel dexMainLabel = new JLabel("DES " + character.getDexMain());
        JLabel conMainLabel = new JLabel("CON " + character.getConMain());
        JLabel intMainLabel = new JLabel("INT " + character.getIntMain());
        JLabel wisMainLabel = new JLabel("SAB " + character.getWisMain());
        JLabel chaMainLabel = new JLabel("CAR " + character.getChaMain());
        
        JLabel strModLabel = new JLabel("(" + character.getStrMod() + ")");
        JLabel dexModLabel = new JLabel("(" + character.getDexMod() + ")");
        JLabel conModLabel = new JLabel("(" + character.getConMod() + ")");
        JLabel intModLabel = new JLabel("(" + character.getIntMod() + ")");
        JLabel wisModLabel = new JLabel("(" + character.getWisMod() + ")");
        JLabel chaModLabel = new JLabel("(" + character.getChaMod() + ")");

        attributesPanel.add(strMainLabel);
        attributesPanel.add(dexMainLabel);
        attributesPanel.add(conMainLabel);
        attributesPanel.add(intMainLabel);
        attributesPanel.add(wisMainLabel);
        attributesPanel.add(chaMainLabel);
        attributesPanel.add(strModLabel);
        attributesPanel.add(dexModLabel);
        attributesPanel.add(conModLabel);
        attributesPanel.add(intModLabel);
        attributesPanel.add(wisModLabel);
        attributesPanel.add(chaModLabel);

        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Atributos");
        attributesPanel.setBorder(border);
        
        return attributesPanel;
    }

    private JPanel createCombatPanel(LogicCharacter character) {
        JPanel combatPanel = new JPanel(new GridLayout(2, 2));
        combatPanel.setPreferredSize(new Dimension(700, 80));

        JLabel hpLabel = new JLabel("Pontos de Vida Totais: " + character.getMaxHP());
        JLabel initiativeLabel = new JLabel("Iniciativa: " + character.getDexMod());
        JLabel speedLabel = new JLabel("Velocidade: " + character.getRace().getRaceSpeed() + "m");
        JLabel acLabel = new JLabel("Classe de Armadura: " + character.getClassy().getClassAC());

        combatPanel.add(hpLabel);
        combatPanel.add(initiativeLabel);
        combatPanel.add(speedLabel);
        combatPanel.add(acLabel);

        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Informações de Combate");
        combatPanel.setBorder(border);


        return combatPanel;
    }

    private JPanel createSkillsPanel(LogicCharacter character) {
        JPanel skillsPanel = new JPanel(new GridLayout(17, 1));
        skillsPanel.setPreferredSize(new Dimension(700, 340));

        JLabel acrobaticsLabel = new JLabel("Acrobacia " + character.getAcrobatics() + " (Des)");
        JLabel arcanaLabel = new JLabel("Arcanismo " + character.getArcana() + " (Int)");
        JLabel athleticsLabel = new JLabel("Atletismo " + character.getAthletics() + " (For)");
        JLabel performanceLabel = new JLabel("Atuação " + character.getPerformance() + " (Car)");
        JLabel deceptionLabel = new JLabel("Enganação " + character.getDeception() + " (Car)");
        JLabel stealthLabel = new JLabel("Furtividade " + character.getStealth() + " (Des)");
        JLabel historyLabel = new JLabel("História " + character.getHistory() + " (Int)");
        JLabel insightLabel = new JLabel("Intuição " + character.getInsight() + " (Sab)");
        JLabel intimidationLabel = new JLabel("Intimidação " + character.getIntimidation() + " (Car)");
        JLabel investigationLabel = new JLabel("Investigação " + character.getInvestigation() + " (Int)");
        JLabel medicineLabel = new JLabel("Medicina " + character.getMedicine() + " (Sab)");
        JLabel natureLabel = new JLabel("Natureza " + character.getNature() + " (Int)");
        JLabel perceptionLabel = new JLabel("Percepção " + character.getPerception() + " (Sab)");
        JLabel persuasionLabel = new JLabel("Persuasão " + character.getPersuasion() + " (Car)");
        JLabel religionLabel = new JLabel("Religião " + character.getReligion() + " (Int)");
        JLabel sleightOfHandLabel = new JLabel("Ladinagem " + character.getSleighofHand() + " (Des)");
        JLabel survivalLabel = new JLabel("Sobrevivência " + character.getSurvival() + " (Sab)");

        skillsPanel.add(acrobaticsLabel);
        skillsPanel.add(arcanaLabel);
        skillsPanel.add(athleticsLabel);
        skillsPanel.add(performanceLabel);
        skillsPanel.add(deceptionLabel);
        skillsPanel.add(stealthLabel);
        skillsPanel.add(historyLabel);
        skillsPanel.add(insightLabel);
        skillsPanel.add(intimidationLabel);
        skillsPanel.add(investigationLabel);
        skillsPanel.add(medicineLabel);
        skillsPanel.add(natureLabel);
        skillsPanel.add(perceptionLabel);
        skillsPanel.add(persuasionLabel);
        skillsPanel.add(religionLabel);
        skillsPanel.add(sleightOfHandLabel);
        skillsPanel.add(survivalLabel);

        Border border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Habilidades");
        skillsPanel.setBorder(border);

        return skillsPanel;
    }

    private JPanel createInventoryPanel(LogicCharacter character) {
        JPanel inventoryPanel = new JPanel(new BorderLayout());
        inventoryPanel.setPreferredSize(new Dimension(680, 80));

        JLabel inventoryLabel = new JLabel("------- Inventário -------", SwingConstants.CENTER);
        inventoryPanel.add(inventoryLabel, BorderLayout.NORTH);

        JTextArea inventoryTextArea = new JTextArea();
        inventoryTextArea.setEditable(false);
        inventoryTextArea.setLineWrap(true);
        inventoryTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(inventoryTextArea);
        inventoryPanel.add(scrollPane, BorderLayout.CENTER);

        ArrayList<String> equipment = character.getEquipment();
        StringBuilder sb = new StringBuilder();
        for (String item : equipment) {
            sb.append(item).append("\n");
        }
        inventoryTextArea.setText(sb.toString());

        return inventoryPanel;
    }

    private JPanel createSpellsPanel(LogicCharacter character) {
        JPanel spellsPanel = new JPanel(new BorderLayout());
        spellsPanel.setPreferredSize(new Dimension(680, 120));

        JLabel spellsLabel = new JLabel("------- Magias -------", SwingConstants.CENTER);
        spellsPanel.add(spellsLabel, BorderLayout.NORTH);

        JTextArea spellsTextArea = new JTextArea();
        spellsTextArea.setEditable(false);
        spellsTextArea.setLineWrap(true);
        spellsTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(spellsTextArea);
        spellsPanel.add(scrollPane, BorderLayout.CENTER);

        ArrayList<String> spells = character.getMagics();
        StringBuilder sb = new StringBuilder();
        for (String spell : spells) {
            sb.append(spell).append("\n");
        }
        spellsTextArea.setText(sb.toString());

        return spellsPanel;
    }
}
