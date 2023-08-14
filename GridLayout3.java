package com.company;


import java.awt.*;
import javax.swing.*;

public class GridLayout3
{
    JFrame frameObj;
    GridLayout3()
    {
        frameObj = new JFrame();
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");


        frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
        frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);
        frameObj.setLayout(new GridLayout(1,1, 5, 3));


        frameObj.setSize(500, 500);
        frameObj.setVisible(true);
    }

    // main method
    public static void main(String argvs[])
    {
        new GridLayout3();
    }
}

