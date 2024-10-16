import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Java_1 extends Applet implements KeyListener {
    String keyPressed = "Key Pressed: None";
    String keyReleased = "Key Released: None";
    String keyUp = "Key Up: None";
    String keyDown = "Key Down: None";

    public void init() {
        setBackground(Color.lightGray);
        addKeyListener(this);
        requestFocusInWindow();  // Set focus to the applet for key events
    }

    public void paint(Graphics g) {
        g.drawString(keyPressed, 20, 40);
        g.drawString(keyReleased, 20, 60);
        g.drawString(keyUp, 20, 80);
        g.drawString(keyDown, 20, 100);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyPressed = "Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode());
        keyDown = "Key Down: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyReleased = "Key Released: " + KeyEvent.getKeyText(e.getKeyCode());
        keyUp = "Key Up: " + KeyEvent.getKeyText(e.getKeyCode());
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Typically used for typed characters
    }

    // To run as a standalone application
    public static void main(String[] args) {
        Frame frame = new Frame("Experiment_1");
        Java_1 applet = new Java_1();

        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
        applet.init();
        applet.start();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
