package gui.Creation.Panels;

import javax.swing.*;
import gui.MedievalToggleButton;
import java.awt.*;

public class ClassyPanel extends JPanel {
    private MedievalToggleButton btWarrior;
    private MedievalToggleButton btMage;
    private MedievalToggleButton btRogue;
    private MedievalToggleButton btPriest;
    private JTextArea txtDesc;
    private JTextArea txtEquip;

    public ClassyPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(680, 420));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        btWarrior = new MedievalToggleButton("Warrior");
        btRogue = new MedievalToggleButton("Rogue");
        btMage = new MedievalToggleButton("Mage");
        btPriest = new MedievalToggleButton("Priest");

        btWarrior.addActionListener(e -> setClassNumber(1));
        btRogue.addActionListener(e -> setClassNumber(2));
        btMage.addActionListener(e -> setClassNumber(3));
        btPriest.addActionListener(e -> setClassNumber(4));

        buttonPanel.add(btWarrior);
        buttonPanel.add(btRogue);
        buttonPanel.add(btMage);
        buttonPanel.add(btPriest);

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        txtDesc = new JTextArea();
        txtDesc.setEditable(false);
        txtEquip = new JTextArea();
        txtEquip.setEditable(false);

        txtDesc.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Descrição"));
        txtEquip.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Equipamentos"));

        infoPanel.add(new JScrollPane(txtDesc));
        infoPanel.add(new JScrollPane(txtEquip));

        add(buttonPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);

        if (!btWarrior.isSelected() && !btRogue.isSelected()&& !btMage.isSelected()  && !btPriest.isSelected()) {
            btWarrior.doClick();
        }
    }

    public int getClassNumber() {
        if (btWarrior.isSelected()) {
            return 1;
        } else if (btRogue.isSelected()) {
            return 2;
        } else if (btMage.isSelected()) {
            return 3;
        } else if (btPriest.isSelected()) {
            return 4;
        }
        return 0;
    }

    public void setClassNumber(int classNumber) {
        String stringDesc;
        String stringEquips;
        switch (classNumber) {
            case 1:
                stringDesc = "Cavaleiros, soldados, mercen\u00E1rios e bandidos, como \nguerreiros, eles compartilham de uma maestria com \narmas e armaduras sem precedentes, bem como um vasto \nconhecimento e habilidades em combate.";
                stringEquips = "Guerreiros usam Armadura Pesada e diversas armas \ncorpo a corpo e \u00E0 dist\u00E2ncia.";
                break;
            case 2:
                stringDesc = "Ladinos contam com sua per\u00EDcia, furtividade e as \nvulnerabilidades de seus inimigos para obter vantagem \nem qualquer situa\u00E7\u00E3o. Eles possuem uma habilidade \nespecial para encontrar a solu\u00E7\u00E3o para praticamente \nqualquer problema, demonstrando desenvoltura e \nversatilidade, a chave de qualquer grupo aventureiro \nde sucesso.";
                stringEquips = "Ladinos usam Armadura Leve, adagas, arcos curos e \nv\u00E1rios equipamentos utilit\u00E1rios.";
                break;
            case 3:
                stringDesc = "Usufruindo de uma trama sutil de magia que permeia \no cosmos, os magos conjuram magias explosivas de fogo, \narcos de rel\u00E2mpagos, enganos sutis e controle de \nmentes de for\u00E7a bruta. Suas magias mais poderosas \npodem transformar uma subst\u00E2ncia em outra, evocar \nmeteoros que caem do c\u00E9u ou abrir portais para outros \nmundos.";
                stringEquips = "Magos n\u00E3o usam armadura, mas possuem v\u00E1rios feiti\u00E7os \npoderosos para atacar e se defender.";
                break;
            case 4:
                stringDesc = "Sacerdotes combinam o poder m\u00E1gico de curar e inspirar \nseus aliados com magias que ferem e debilitam seus \ninimigos. Eles podem causar medo e pavor, espalhar \npragas ou venenos, e at\u00E9 lan\u00E7ar fogo divino para \nconsumir seus inimigos.";
                stringEquips = "Sacerdotes usam Armadura M\u00E9dia, possuem magias de cura, \nmagias ofensivas e podem atacar coma ma\u00E7as.";
                break;
            default:
                stringDesc = "";
                stringEquips = "";
                break;
        }
        txtDesc.setText(stringDesc);
        txtEquip.setText(stringEquips);
    }
}