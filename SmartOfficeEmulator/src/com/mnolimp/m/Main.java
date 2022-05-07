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
    JButton buttonLighters = new JButton("Lighters");
    JButton buttonSpeakers = new JButton("Speakers");
    JButton buttonConditioner = new JButton("Conditioner");
    JButton buttonComputer = new JButton("Computer");
    JButton buttonTV = new JButton("TV");

    public Main(){
        super("Emulator");

        setVisible(true);

        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelLeft.setBackground(Color.ORANGE);
        panelRight.setBackground(Color.PINK);
        panelLeft.setLayout(new GridLayout(8, 1));
        panelRight.setLayout(new GridLayout(8, 1));

        buttonCoffeeMachine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                CoffeeMachine.setCoffeeMachineLabel();
                setContentPane(container);
            }
        });
        buttonCoffeeMachine.setBackground(Color.WHITE);
        panelLeft.add(buttonCoffeeMachine);

        buttonLighters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                Lighters.setLightersLabel();
                setContentPane(container);
            }
        });
        buttonLighters.setBackground(Color.WHITE);
        panelLeft.add(buttonLighters);

        buttonSpeakers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                Speakers.setSpeakersLabel();
                setContentPane(container);
            }
        });
        buttonSpeakers.setBackground(Color.WHITE);
        panelLeft.add(buttonSpeakers);

        buttonConditioner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                AirConditioner.setConditionerLabel();
                setContentPane(container);
            }
        });
        buttonConditioner.setBackground(Color.WHITE);
        panelLeft.add(buttonConditioner);

        buttonComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                Computer.setComputerLabel();
                setContentPane(container);
            }
        });
        buttonComputer.setBackground(Color.WHITE);
        panelLeft.add(buttonComputer);

        buttonTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRight.removeAll();
                TV.setTVLabel();
                setContentPane(container);
            }
        });
        buttonTV.setBackground(Color.WHITE);
        panelLeft.add(buttonTV);

        container.setLayout(new GridLayout());
        container.add(panelLeft);
        container.add(panelRight);
        setContentPane(container);
    }

    public static void main(String[] args) {
        new Main();
    }
}
