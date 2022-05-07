package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeMachine {
    static JButton buttonPrepareCoffee = new JButton("Prepare a coffee");
    static JButton buttonSmallVolume = new JButton("Small volume");
    static JButton buttonBigVolume = new JButton("Big volume");
    static JButton buttonNoSugar = new JButton("No sugar");
    static JButton buttonNoWater = new JButton("No water");
    static JButton buttonSoftCoffee = new JButton("Soft coffee");
    static JButton buttonStrongCoffee = new JButton("Strong coffee");

    public static void setCoffeeMachineLabel(){
        setCoffeeMachineColor();
        Main.panelRight.add(buttonPrepareCoffee);
        Main.panelRight.add(buttonSmallVolume);
        Main.panelRight.add(buttonBigVolume);
        Main.panelRight.add(buttonSoftCoffee);
        Main.panelRight.add(buttonStrongCoffee);
        Main.panelRight.add(buttonNoSugar);
        Main.panelRight.add(buttonNoWater);
    }

    public static void setCoffeeMachineColor(){
        setCoffeeClickListeners();

        buttonPrepareCoffee.setBackground(Color.WHITE);
        buttonSmallVolume.setBackground(Color.WHITE);
        buttonBigVolume.setBackground(Color.WHITE);
        buttonNoSugar.setBackground(Color.RED);
        buttonNoWater.setBackground(Color.RED);
        buttonSoftCoffee.setBackground(Color.WHITE);
        buttonStrongCoffee.setBackground(Color.WHITE);
    }

    public static void setCoffeeClickListeners(){
        buttonPrepareCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSmallVolume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonBigVolume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNoSugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNoWater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSoftCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonStrongCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
