package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirConditioner {
    static JButton buttonMakeTemperatureHigher = new JButton("Make temperature higher");
    static JButton buttonMakeTemperatureLower = new JButton("Make temperature lower");
    static JButton buttonConditionerBreakdown = new JButton("Conditioner breakdown");
    static JButton buttonOnConditioner = new JButton("On conditioner");
    static JButton buttonOffConditioner = new JButton("Off conditioner");

    public static void setConditionerLabel(){
        setConditionerColor();
        Main.panelRight.add(buttonMakeTemperatureHigher);
        Main.panelRight.add(buttonMakeTemperatureLower);
        Main.panelRight.add(buttonOnConditioner);
        Main.panelRight.add(buttonOffConditioner);
        Main.panelRight.add(buttonConditionerBreakdown);
    }

    public static void setConditionerColor(){
        setConditionerClickListeners();

        buttonMakeTemperatureHigher.setBackground(Color.WHITE);
        buttonMakeTemperatureLower.setBackground(Color.WHITE);
        buttonConditionerBreakdown.setBackground(Color.RED);
        buttonOnConditioner.setBackground(Color.WHITE);
        buttonOffConditioner.setBackground(Color.WHITE);
    }

    public static void setConditionerClickListeners(){
        buttonMakeTemperatureHigher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonMakeTemperatureLower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonConditionerBreakdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOnConditioner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOffConditioner.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
