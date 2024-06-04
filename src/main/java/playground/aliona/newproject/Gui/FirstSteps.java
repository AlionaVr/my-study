package main.java.playground.aliona.newproject.Gui;

import javax.swing.*;
import java.awt.*;

public class FirstSteps {
    JFrame frame;
    JButton button;


    public static void main(String[] args) {
        FirstSteps step = new FirstSteps();
        step.go();

    }

    public void go() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        MyDrawPanel drawPanel = new MyDrawPanel();
        button = new JButton("click me to change colors");
        MyButtonActionListener myListener = new MyButtonActionListener(button, frame, drawPanel);
        button.addActionListener(myListener);

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

    }




}


