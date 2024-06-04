package main.java.playground.aliona.newproject.JListSample;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;


public class List implements ListSelectionListener {
    String [] listEntries = {"milk", "cookies", "cake", "eggs","tea"};
    JList list = new JList(listEntries);
        public static void main(String[] args) {
            List gui = new List();
            gui.start();
        }
        public void start () {

            JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            JScrollPane scroller = new JScrollPane(list);
            scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            list.setVisibleRowCount(4);
            ;
            list.addListSelectionListener(this);
            panel.add(scroller);
            frame.getContentPane().add(BorderLayout.CENTER, panel);

            frame.setSize(200, 200);
            frame.setVisible(true);
        }



    @Override
    public void valueChanged(ListSelectionEvent e) {
    if ( !e.getValueIsAdjusting() ) {
        String selection = (String) list.getSelectedValue();
        System.out.println(selection);
    }

    }
}


