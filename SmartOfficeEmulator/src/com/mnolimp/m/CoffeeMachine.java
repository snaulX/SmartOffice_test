package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeMachine {
    static JButton buttonPrepareCoffee = new JButton("Prepare a coffee");
    static JButton buttonNoCoffee = new JButton("No coffee");
    static JButton buttonNoMilk = new JButton("No milk");
    static JButton buttonNoWater = new JButton("No water");
    static JButton buttonDirty = new JButton("Dirty");

    public static void setCoffeeMachineLabel(){
        setCoffeeMachineColor();
        Main.panelRight.add(buttonPrepareCoffee);
        Main.panelRight.add(buttonNoCoffee);
        Main.panelRight.add(buttonDirty);
        Main.panelRight.add(buttonNoMilk);
        Main.panelRight.add(buttonNoWater);
    }

    public static void setCoffeeMachineColor(){
        setCoffeeClickListeners();

        buttonPrepareCoffee.setBackground(Color.WHITE);
        buttonNoCoffee.setBackground(Color.RED);
        buttonNoMilk.setBackground(Color.RED);
        buttonNoWater.setBackground(Color.RED);
        buttonDirty.setBackground(Color.RED);
    }

    public static void setCoffeeClickListeners(){
        buttonPrepareCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNoCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNoMilk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonNoWater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonDirty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
