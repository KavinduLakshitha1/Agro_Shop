package lk.luckysoft.agro.component;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class test extends JPanel {

    public test() {
        setOpaque(false); // Make the panel non-opaque
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int arc = 30; // The arc width and height for the rounded corners

        // Create the rounded shape for the left side
        GeneralPath path = new GeneralPath();
        path.moveTo(arc, 0);
        path.quadTo(0, 0, 0, arc);
        path.lineTo(0, height - arc);
        path.quadTo(0, height, arc, height);
        path.lineTo(width, height);
        path.lineTo(width, 0);
        path.closePath();

        // Draw the rounded rectangle
        g2.setColor(getBackground());
        g2.fill(path);

        // Optional: Draw the border of the rounded shape
        g2.setColor(Color.GRAY);
        g2.draw(path);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 200); // Set preferred size for the panel
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rounded Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RoundedPanel roundedPanel = new RoundedPanel();
        roundedPanel.setBackground(Color.LIGHT_GRAY);
       

        frame.add(roundedPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
