package gui.Creation.Panels;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.MedievalToggleButton;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class RacePanel extends JPanel {
    private MedievalToggleButton btHuman;
    private MedievalToggleButton btDwarf;
    private MedievalToggleButton btElf;
    private JTextArea txtDescription;
    private JTextArea txtBonuses;
    private JLabel imageLabel;

    public RacePanel() {
        setLayout(new BorderLayout());

        setPreferredSize(new Dimension(680, 420));

        // Panel for the buttons
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        btHuman = new MedievalToggleButton("Humano");
        btDwarf = new MedievalToggleButton("Anão");
        btElf = new MedievalToggleButton("Elfo");

        btHuman.setPreferredSize(new Dimension(120, btHuman.getPreferredSize().height));
        btDwarf.setPreferredSize(new Dimension(120, btDwarf.getPreferredSize().height));
        btElf.setPreferredSize(new Dimension(120, btElf.getPreferredSize().height));

        // Set action listeners for the buttons
        btHuman.addActionListener(e -> setRaceInfo("Nos confins da maioria dos mundos, os humanos s\u00E3o a \nmais jovem das ra\u00E7as comuns, chegando mais tarde no \ncen\u00E1rio mundial e com uma vida curta, se comparados \naos an\u00F5es, elfos e drag\u00F5es. \nTalvez seja por causa de suas vidas mais curtas que \neles se esforcem para alcan\u00E7ar o m\u00E1ximo que podem nos \nanos que t\u00EAm.", "Humanos s\u00E3o vers\u00E1teis. Possuem +1 em todos os atributos.", "/gui/images/human.png"));
        btDwarf.addActionListener(e -> setRaceInfo("Audazes e resistentes, os an\u00F5es s\u00E3o conhecidos como \nh\u00E1beis guerreiros, mineradores e trabalhadores em \npedra e metal. Embora tenham menos de 1,50 metro de \naltura, os an\u00F5es s\u00E3o t\u00E3o largos e compactos que podem \npesar tanto quanto um humano 60 cent\u00EDmetros mais alto. \nSua coragem e resist\u00EAncia compete facilmente com \nqualquer povo mais alto.", "An\u00F5es recebem +2 de For\u00E7a e +2 de Constitui\u00E7\u00E3o", "/gui/images/dwarf.png"));
        btElf.addActionListener(e -> setRaceInfo("Elfos s\u00E3o um povo m\u00E1gico de gra\u00E7a sobrenatural, \nvivendo no mundo sem pertencer inteiramente \u00E0 ele. \nEles vivem em lugares de beleza et\u00E9rea, no meio de \nantigas florestas ou em torres prateadas brilhando \ncom luz fe\u00E9rica, onde uma m\u00FAsica suave ecoa atrav\u00E9s \ndo ar e fragr\u00E2ncias suaves flutuam na brisa.", "Elfos tem +2 de Destreza e +1 de Intelig\u00EAncia", "/gui/images/elf.png"));

        buttonPanel.add(btHuman);
        buttonPanel.add(btDwarf);
        buttonPanel.add(btElf);

        
        JPanel infoPanel = new JPanel(new BorderLayout());
        JPanel fieldsPanel = new JPanel(new GridLayout(2, 1));
        txtDescription = new JTextArea();
        txtBonuses = new JTextArea();
        txtDescription.setEditable(false);
        txtBonuses.setEditable(false);
        fieldsPanel.add(new JScrollPane(txtDescription));
        fieldsPanel.add(new JScrollPane(txtBonuses));

        // Image label
        imageLabel = new JLabel();
        ImageIcon imageIcon = new ImageIcon();
        imageLabel.setIcon(imageIcon);

        buttonPanel.setSize(400, 20);
        txtDescription.setSize(400, 200);
        txtDescription.setSize(400, 200);

        infoPanel.add(fieldsPanel, BorderLayout.CENTER);
        infoPanel.add(imageLabel, BorderLayout.EAST);

        add(buttonPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);

        if (!btHuman.isSelected() && !btDwarf.isSelected() && !btElf.isSelected()) {
            btHuman.doClick();
        }

    }

    public int getRaceNumber() {
        if (btHuman.isSelected()) {
            return 1;
        } else if (btDwarf.isSelected()) {
            return 2;
        } else if (btElf.isSelected()) {
            return 3;
        }
        return 1;
    }

    // Method to set the text fields and image based on the selected race
    public void setRaceInfo(String text1, String text2, String imagePath) {
        txtDescription.setText(text1);
        txtBonuses.setText(text2);
        try {
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            BufferedImage image = ImageIO.read(inputStream);
            ImageIcon imageIcon = new ImageIcon(image.getScaledInstance(280, 400, Image.SCALE_SMOOTH));
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}