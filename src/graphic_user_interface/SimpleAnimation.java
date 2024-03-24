package graphic_user_interface;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    JFrame frame;
    int x = 10;
    int y = 10;
    GraphicPanel graphicPanel;

    public static void main(String[] args) {
        SimpleAnimation miniAnimation = new SimpleAnimation();
        miniAnimation.createFrame();
        miniAnimation.animate();
    }

    private void createFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphicPanel = new GraphicPanel();
        frame.getContentPane().add(graphicPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    private void animate() {
        do {
            x++;
            y++;
            graphicPanel.repaint();
            try {
                Thread.sleep(20);
            } catch (Exception ignored){
            }
        } while ((x < frame.getWidth()-150) && (y < frame.getHeight()-150));
    }

    class GraphicPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());
            g.setColor(Color.cyan);
            g.fillOval(x, y, 100, 100);
        }
    }
}
