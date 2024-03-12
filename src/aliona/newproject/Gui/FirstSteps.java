package aliona.newproject.Gui;

import javax.swing.*;
public class FirstSteps {
    JButton button;
    public static void main(String[] args) {
        FirstSteps step = new FirstSteps();
        step.go();
    }
    public void go () {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        MyButtonActionListener myListener = new MyButtonActionListener(button);
        button.addActionListener(myListener);
        button.setSize(10, 10);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.getContentPane().add(button);
    }
}

