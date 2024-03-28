package graphic_user_interface;

import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;

public class MiniPlayer {
    static JFrame frame = new JFrame("My first music video");
    static MyGraphicP panel;

    public static void main(String[] args) {
        MiniPlayer miniPlayer = new MiniPlayer();
        miniPlayer.play();
    }

    public void play() {
        configurateGUI();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addControllerEventListener(panel, new int[]{127});
            Sequence sequence = new Sequence(Sequence.PPQ, 4);
            Track track = sequence.createTrack();
            int r;
            for (int i = 5; i < 60; i++) {
                r = (int) ((Math.random() * 50) + 1);
                track.add(createEvent(144, 1, r, 100, i));
                track.add(createEvent(176, 1, 127, 0, i));
                track.add(createEvent(128, 1, r, 100, i + 2));
            }
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void configurateGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MyGraphicP();
        frame.setContentPane(panel);
        frame.setBounds(30, 30, 300, 300);
        frame.setVisible(true);
    }

    public static MidiEvent createEvent(int plc, int channel, int one, int two, int takt) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(plc, channel, one, two);
            event = new MidiEvent(a, takt);
        } catch (Exception ignored) {
        }
        return event;
    }

    class MyGraphicP extends JPanel implements ControllerEventListener {
        boolean message = false;

        @Override
        public void controlChange(ShortMessage event) {
            message = true;
            repaint();
        }

        public void paintComponent(Graphics g) {
            if (message) {
                Graphics2D g2 = (Graphics2D) g;
                int c = (int) (Math.random() * 250);
                int z = (int) (Math.random() * 250);
                int n = (int) (Math.random() * 250);

                g2.setColor(new Color(c, z, n));

                int height = (int) ((Math.random() * 120) + 10);
                int width = (int) ((Math.random() * 120) + 10);

                int x = (int) ((Math.random() * 40) + 10);
                int y = (int) ((Math.random() * 40) + 10);

                g2.fillRect(x, y, width, height);
                message = false;
            }
        }
    }
}
