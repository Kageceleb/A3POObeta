package gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MedievalButton extends JButton {

    private Color backgroundColor;
    private Color foregroundColor;
    private boolean pressed;

    public MedievalButton(String text) {
        super(text);
        initializeButton();
        setColors(new Color(153, 102, 0), Color.WHITE); // Cor
    }

    private void initializeButton() {

        setFont(new Font("Serif", Font.BOLD, 16)); // Fonte e Tamanho
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Borda

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Cursor

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                pressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                pressed = false;
                repaint();
            }

            
        });

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                setBackground(new Color(255, 215, 0));
            }
        });

    }

    public void setColors(Color backgroundColor, Color foregroundColor) {
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        setBackground(backgroundColor);
        setForeground(foregroundColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(pressed ? new Color(255, 215, 0) : backgroundColor);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.setColor(foregroundColor);
        g2d.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g2d.setFont(getFont());
        FontMetrics fontMetrics = g2d.getFontMetrics();
        int textX = (getWidth() - fontMetrics.stringWidth(getText())) / 2;
        int textY = (getHeight() - fontMetrics.getHeight()) / 2 + fontMetrics.getAscent();
        g2d.drawString(getText(), textX, textY);
        g2d.dispose();
    }
}
