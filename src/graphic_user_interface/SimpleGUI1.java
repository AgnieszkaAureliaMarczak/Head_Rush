package graphic_user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI1 implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGUI1 appGUI = new SimpleGUI1();
        appGUI.letsStart();
    }

    public void letsStart(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Color change");
        button.addActionListener(this);

        MyGraphicPanel myPanel = new MyGraphicPanel();

        frame.getContentPane().add(BorderLayout.CENTER, myPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(700,600);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}

class MyGraphicPanel extends JPanel{
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int red = drawColorCode();
        int green = drawColorCode();
        int blue = drawColorCode();
        Color startColor = new Color(red, green, blue);

        red = drawColorCode();
        green = drawColorCode();
        blue = drawColorCode();
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70.f, 70.f, startColor, 200.f, 70.f, endColor);
        g2d.setPaint(gradient);
        g.fillOval(70,70, 200,200);
    }

    private int drawColorCode(){
        return (int) (Math.random() * 256);
    }
}
