package graphic_user_interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1 implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGUI1 appGUI = new SimpleGUI1();
        appGUI.letsStart();
    }

    public void letsStart(){
        JFrame frame = new JFrame();
        button = new JButton("Clcik Me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,600);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked");
    }
}
