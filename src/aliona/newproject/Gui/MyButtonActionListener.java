package aliona.newproject.Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonActionListener implements ActionListener {
    private final JButton myButton;
    public MyButtonActionListener(JButton myButton) {
        this.myButton = myButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myButton.setText("I've been clicked");
        myButton.setForeground(Color.red);
    }
}
