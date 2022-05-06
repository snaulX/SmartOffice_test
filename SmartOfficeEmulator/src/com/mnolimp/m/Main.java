package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private JPanel container = new JPanel();
    private JPanel panelLeft = new JPanel();
    private JPanel panelRight = new JPanel();
    private JSplitPane splitPane;

    public Main(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        panelLeft.setBackground(Color.gray);
        panelRight.setBackground(Color.GREEN);
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
        panelLeft.setBounds(0,0,getWidth()/4, getHeight()/4);
        container.add(panelLeft);
        container.add(panelRight);
        setContentPane(container);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
