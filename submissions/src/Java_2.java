import java.awt.*;
import java.awt.event.*;

public class Java_2 extends Frame implements MouseListener {

    public Java_2() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setVisible(true);
        System.out.println("Mouse Entered the frame!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the frame!");
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        Java_2 frame = new Java_2();
        frame.setLocationRelativeTo(null);
    }
}
