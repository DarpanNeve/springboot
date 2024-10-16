import java.awt.*;
import java.awt.event.*;

public class Java_3 extends Frame implements ActionListener {
    TextField tfMath, tfScience, tfEnglish;
    Button submitButton;

    public Java_3() {
        setTitle("Student Marks Input");
        setSize(400, 300);
        setLayout(new GridLayout(4, 2));

        add(new Label("Math:"));
        tfMath = new TextField();
        add(tfMath);

        add(new Label("Science:"));
        tfScience = new TextField();
        add(tfScience);

        add(new Label("English:"));
        tfEnglish = new TextField();
        add(tfEnglish);

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String math = tfMath.getText();
            String science = tfScience.getText();
            String english = tfEnglish.getText();

            int total = Integer.parseInt(math) + Integer.parseInt(science) + Integer.parseInt(english);
            double average = total / 3.0;
            String result = "Total: " + total + ", Average: " + average;

            ResultWindow resultWindow = new ResultWindow(result);
        }
    }

    public static void main(String[] args) {
        new Java_3();
    }
}

class ResultWindow extends Frame {
    public ResultWindow(String result) {
        setTitle("Student Result");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label resultLabel = new Label(result);
        add(resultLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }
}
