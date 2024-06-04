package main.java.playground.aliona.newproject.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonActionListener implements ActionListener {
    private final JButton myButton;
    private JFrame myFrame;
    private final MyDrawPanel drawPanel;

    public MyButtonActionListener(JButton myButton, JFrame myFrame, MyDrawPanel drawPanel) {
        this.myButton = myButton;
        this.myFrame = myFrame;
        this.drawPanel = drawPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myButton.setText("I've been repainted");
        drawPanel.color1 = Color.RED; // Новый цвет color1
        drawPanel.color2 = Color.YELLOW; // Новый цвет color2
        drawPanel.size = drawPanel.size + 0.1d;
        drawPanel.repaint(); // Перерисовка компонента
    }

}
