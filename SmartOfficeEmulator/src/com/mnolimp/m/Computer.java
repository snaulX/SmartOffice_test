package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Computer {
    static JButton buttonOnComputer = new JButton("On computer");
    static JButton buttonOffComputer = new JButton("Of computer");
    static JButton buttonLockComputer = new JButton("Lock computer");
    static JButton buttonUnlockComputer = new JButton("Unlock computer");
    static JButton buttonRemoteAccess = new JButton("Remote access");
    static JButton buttonCreateWeb = new JButton("Create web");
    static JButton buttonComputerBreakdown = new JButton("Computer breakdown");

    public static void setComputerLabel(){
        setComputerColor();
        Main.panelRight.add(buttonOnComputer);
        Main.panelRight.add(buttonOffComputer);
        Main.panelRight.add(buttonLockComputer);
        Main.panelRight.add(buttonUnlockComputer);
        Main.panelRight.add(buttonRemoteAccess);
        Main.panelRight.add(buttonCreateWeb);
        Main.panelRight.add(buttonComputerBreakdown);
    }

    public static void setComputerColor(){
        setComputerClickListeners();

        buttonOnComputer.setBackground(Color.WHITE);
        buttonOffComputer.setBackground(Color.WHITE);
        buttonLockComputer.setBackground(Color.WHITE);
        buttonUnlockComputer.setBackground(Color.WHITE);
        buttonRemoteAccess.setBackground(Color.WHITE);
        buttonCreateWeb.setBackground(Color.WHITE);
        buttonComputerBreakdown.setBackground(Color.RED);
    }

    public static void setComputerClickListeners(){
        buttonOnComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOffComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonLockComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonUnlockComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonRemoteAccess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonCreateWeb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonComputerBreakdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

