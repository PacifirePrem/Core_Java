import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ButtonDemo extends JFrame
{
    JButton ADD,SUBTRACT,MULTIPLY;
    JLabel lbl;
    ButtonDemo()
    {
        ADD = new JButton("ADD");
        SUBTRACT = new JButton ("SUBTRACT");
        MULTIPLY = new JButton ("MULTIPLY");
        lbl = new JLabel ("");
        setLayout (new GridLayout(4,1));
        setSize (400,200);
        add(ADD);
        add(SUBTRACT);
        add(MULTIPLY);
        add(lbl);
        setVisible(true);
        ButtonHandler bh = new ButtonHandler();
        ADD.addActionListener(bh);
        ADD.addActionListener(bh);
        SUBTRACT.addActionListener(bh);
        MULTIPLY.addActionListener(bh);
    }
    class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            int x1 = 15;
            int x2 = 10;

            if (ae.getSource()==ADD)
            {
                lbl.setText("ADDING two numbers: "+(x1+x2));
            }
            if (ae.getSource()==SUBTRACT)
            {
                lbl.setText("SUBTRACTING two numbers: "+(x1-x2));
            }
            if (ae.getSource()==MULTIPLY) {
                lbl.setText("MULTIPLYING two numbers: " + (x1 * x2));
            }
        }
    }
    public static void main(String args[])
    {
        new ButtonDemo();
    }
}