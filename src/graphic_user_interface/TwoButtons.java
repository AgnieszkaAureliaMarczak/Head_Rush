package graphic_user_interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtons {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.startWork();
    }

    public void startWork() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("This is a Label");
        MyGraphicPanel2 newPanel = new MyGraphicPanel2();

        frame.getContentPane().add(BorderLayout.CENTER, newPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(700,600);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Label's Text");
        }
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }

    class MyGraphicPanel2 extends JPanel {
        public void paintComponent(Graphics g) {
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
            g.fillOval(70, 70, 200, 200);
        }

        private int drawColorCode() {
            return (int) (Math.random() * 256);
        }
    }
}
