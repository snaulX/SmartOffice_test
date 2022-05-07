package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Speakers {
    static JButton buttonPlayMessage = new JButton("Play message");
    static JButton buttonPlayMusic = new JButton("Play music");
    static JButton buttonSpeakersBreakdown = new JButton("Speakers breakdown");
    static JButton buttonOnSpeakers = new JButton("On speakers");
    static JButton buttonOffSpeakers = new JButton("Off speakers");

    public static void setSpeakersLabel(){
        setSpeakersColor();
        Main.panelRight.add(buttonPlayMessage);
        Main.panelRight.add(buttonPlayMusic);
        Main.panelRight.add(buttonOnSpeakers);
        Main.panelRight.add(buttonOffSpeakers);
        Main.panelRight.add(buttonSpeakersBreakdown);
    }

    public static void setSpeakersColor(){
        setSpeakersClickListeners();

        buttonPlayMessage.setBackground(Color.WHITE);
        buttonPlayMusic.setBackground(Color.WHITE);
        buttonSpeakersBreakdown.setBackground(Color.RED);
        buttonOnSpeakers.setBackground(Color.WHITE);
        buttonOffSpeakers.setBackground(Color.WHITE);
    }

    public static void setSpeakersClickListeners(){
        buttonPlayMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonPlayMusic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSpeakersBreakdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOnSpeakers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOffSpeakers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
