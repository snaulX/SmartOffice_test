package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    static JPanel container = new JPanel();
    static JPanel panelLeft = new JPanel();
    static JPanel panelRight = new JPanel();

    JButton buttonCoffeeMachine = new JButton("Coffee Machine");

    public Main(){
        super("Emulator");

        setVisible(true);

        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelLeft.setBackground(Color.gray);
        panelRight.setBackground(Color.GREEN);

        buttonCoffeeMachine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CoffeeMachine.setCoffeeMachineLabel();
                setContentPane(container);
            }
        });

        panelLeft.add(buttonCoffeeMachine);

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(panelLeft);
        container.add(panelRight);
        setContentPane(container);
    }

    public static void main(String[] args) {
        new Main();
    }
}
