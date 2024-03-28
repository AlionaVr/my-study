package aliona.newproject.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDrawPanel extends JPanel {
    Color color1 = Color.blue;
    Color color2 = Color.orange;
    int x = 20;
    int y = 20;

    double size = 1.0d;
    private Timer timer;

    public MyDrawPanel() {
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                x++;
                y++;
                if (x >= 150 && y >= 150) {
                    timer.stop();}
                repaint();
            }
        });
        timer.start();


    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(20, 20, color1, 200, 200, color2);

        g2d.setPaint(gradient);
        g2d.clearRect(0, 0, getWidth(), getHeight());
            g.fillOval(x, y, (int) (70 * size), (int) (70 * size));
        }


        }





