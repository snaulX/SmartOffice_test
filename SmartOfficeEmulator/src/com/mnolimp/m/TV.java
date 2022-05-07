package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TV {
    static JButton buttonOnTV = new JButton("On TV");
    static JButton buttonOffTV = new JButton("Off TV");
    static JButton buttonShowPicture = new JButton("Show picture");
    static JButton buttonSlideShow = new JButton("Slide show");
    static JButton buttonShowVideo = new JButton("Show video");
    static JButton buttonTVBreakdown = new JButton("TV breakdown");

    public static void setTVLabel(){
        setTVColor();
        Main.panelRight.add(buttonOnTV);
        Main.panelRight.add(buttonOffTV);
        Main.panelRight.add(buttonShowPicture);
        Main.panelRight.add(buttonSlideShow);
        Main.panelRight.add(buttonShowVideo);
        Main.panelRight.add(buttonTVBreakdown);
    }

    public static void setTVColor(){
        setTVClickListeners();

        buttonOnTV.setBackground(Color.WHITE);
        buttonOffTV.setBackground(Color.WHITE);
        buttonShowPicture.setBackground(Color.WHITE);
        buttonSlideShow.setBackground(Color.WHITE);
        buttonShowVideo.setBackground(Color.WHITE);
        buttonTVBreakdown.setBackground(Color.RED);
    }

    public static void setTVClickListeners(){
        buttonOnTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonOffTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonShowPicture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonSlideShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonShowVideo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buttonTVBreakdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}


