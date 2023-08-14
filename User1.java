import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JTextField;

import java.text.*;
import java.net.*;
import java.io.*;

public class User1 implements ActionListener {
    JTextField text;

    Jpanel a1;
    static Box vertical = Box.createVerticalBox();
    static JFrame f = new JFrame();
    static DataOutputStream dout;

    User1(){
        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null);
        f.add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        imageicon i3 = new imageicon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter()){
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        }
    }

    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/mirzapur.png"));
    Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel profile = new JLabel(i6);
    back.setBounds(40, 10, 50, 50);
    p1.add(profile);

    ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
    Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
    ImageIcon i9 = new ImageIcon(i8);
    JLabel video = new JLabel(i9);
    video.setBounds(300, 20, 30, 30);
    p1.add(video);

    ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
    Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
    ImageIcon i12 = new ImageIcon(i11);
    JLabel phone = new JLabel(i12);
    phone.setBounds(360, 20, 35, 30);
    p1.add(phone);


    public static void main(String[] args) {
        
    }
}
