package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lighters {
    static JButton buttonMakeLightWarmer = new JButton("Make light warmer");
    static JButton buttonMakeLightColder = new JButton("Make light colder");
    static JButton buttonMakeLightBrighter = new JButton("Make light brighter");
    static JButton buttonMakeLightDarker = new JButton("Make light darker");
    static JButton buttonWiringBreakdown = new JButton("Wiring breakdown");
    static JButton buttonOnLights = new JButton("On lights");
    static JButton buttonOffLights = new JButton("Off lights");

    public static void setLightersLabel(){
        setLightersColor();
        Main.panelRight.add(buttonMakeLightWarmer);
        Main.panelRight.add(buttonMakeLightColder);
        Main.panelRight.add(buttonMakeLightBrighter);
        Main.panelRight.add(buttonMakeLightDarker);
        Main.panelRight.add(buttonOnLights);
        Main.panelRight.add(buttonOffLights);
        Main.panelRight.add(buttonWiringBreakdown);
    }

    public static void setLightersColor(){
        setLightersClickListeners();

        buttonMakeLightWarmer.setBackground(Color.WHITE);
        buttonMakeLightColder.setBackground(Color.WHITE);
        buttonMakeLightBrighter.setBackground(Color.WHITE);
        buttonMakeLightDarker.setBackground(Color.WHITE);
        buttonWiringBreakdown.setBackground(Color.RED);
        buttonOnLights.setBackground(Color.WHITE);
        buttonOffLights.setBackground(Color.WHITE);
    }

    public static void setLightersClickListeners(){
        buttonMakeLightWarmer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonMakeLightColder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonMakeLightBrighter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonMakeLightDarker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonWiringBreakdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOnLights.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOffLights.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
