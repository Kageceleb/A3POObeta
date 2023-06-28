package gui;

import javax.swing.BorderFactory;
import javax.swing.JToggleButton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MedievalToggleButton extends JToggleButton {
    private Color backgroundColor;
    private Color foregroundColor;

    public MedievalToggleButton(String text) {
        super(text);
        initializeButton();
        setColors(new Color(153, 102, 0), Color.WHITE);
    }

    private void initializeButton() {
        setFont(new Font("Serif", Font.BOLD, 16));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetOtherButtons();
                setBackground(new Color(255, 215, 0));
            }
        });
    }

    private void resetOtherButtons() {
        for (java.awt.Component sibling : getParent().getComponents()) {
            if (sibling instanceof MedievalToggleButton && sibling != this) {
                ((MedievalToggleButton) sibling).setBackground(backgroundColor);
            }
        }
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
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(getBackground());
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
