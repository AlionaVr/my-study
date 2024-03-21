package aliona.newproject.Gui;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    Color color1 = Color.blue;
    Color color2 = Color.orange;

    double size = 1.0d;

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, color1, 150, 150, color2);
        g2d.setPaint(gradient);
        g.fillOval(70, 70, (int) (100 * size), (int) (100 * size));
    }

}
