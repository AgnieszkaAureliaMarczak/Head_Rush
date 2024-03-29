package graphic_user_interface;

import javax.swing.*;
import java.awt.*;

public class SwingComponents {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.draw();
    }

    static class Panel1 {
        public void draw() {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();

            panel.setBackground(Color.DARK_GRAY);
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            JButton button0 = new JButton("Click Me");
            JButton button1 = new JButton("I'm a bigger button");
            JButton button2 = new JButton("No, I'm a bigger button");

            panel.add(button0);
            panel.add(button1);
            panel.add(button2);

            frame.getContentPane().add(BorderLayout.EAST, panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(200, 200);
            frame.setVisible(true);
        }
    }
}
