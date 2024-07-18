package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class app extends JFrame {
    private JLabel lbl;
    public app(){
        this.setTitle("Second test for java");
        this.setSize(300, 400);

        lbl = new JLabel("Hi, i'm the second test for java");
        this.add(lbl, BorderLayout.NORTH);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}