package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;

public class CoffeeMachine {
    static JButton buttonPrepareCoffee = new JButton("Prepare a coffee");
    static JButton buttonSmallVolume = new JButton("Small volume");
    static JButton buttonBigVolume = new JButton("Big volume");
    static JButton buttonNoSugar = new JButton("No sugar");
    static JButton buttonNoWater = new JButton("No water");
    static JButton buttonSoftCoffee = new JButton("Soft coffee");
    static JButton buttonStrongCoffee = new JButton("Strong coffee");

    public static void setCoffeeMachineLabel(){
        buttonPrepareCoffee.setBackground(Color.WHITE);
        buttonSmallVolume.setBackground(Color.WHITE);
        buttonBigVolume.setBackground(Color.WHITE);
        buttonNoSugar.setBackground(Color.WHITE);
        buttonNoWater.setBackground(Color.WHITE);
        buttonSoftCoffee.setBackground(Color.WHITE);
        buttonStrongCoffee.setBackground(Color.WHITE);

        Main.panelRight.add(buttonPrepareCoffee);
        Main.panelRight.add(buttonSmallVolume);
        Main.panelRight.add(buttonBigVolume);
        Main.panelRight.add(buttonNoSugar);
        Main.panelRight.add(buttonNoWater);
        Main.panelRight.add(buttonSoftCoffee);
        Main.panelRight.add(buttonStrongCoffee);
    }
}
