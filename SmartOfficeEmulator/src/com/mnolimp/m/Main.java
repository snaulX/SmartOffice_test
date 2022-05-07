package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

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

    static URL url;
    static HttpURLConnection connection;

    static Map<String, String> parameters = new HashMap<>();

    public static String getParamsString(final Map<String, String> params) {
        final StringBuilder result = new StringBuilder();

        params.forEach((name, value) -> {
            try {
                result.append(URLEncoder.encode(name, "UTF-8"));
                result.append('=');
                result.append(URLEncoder.encode(value, "UTF-8"));
                result.append('&');
            } catch (final UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        });

        final String resultString = result.toString();
        return !resultString.isEmpty()
                ? resultString.substring(0, resultString.length() - 1)
                : resultString;
    }

    public static void connect() throws IOException {
        url = new URL("https://localhost:7075");
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        parameters.put("coffee", "create");
        connection.setDoOutput(true);
        final DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        out.writeBytes(getParamsString(parameters));
        out.flush();
        out.close();
    }

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

    public static void main(String[] args) throws IOException {
        new Main();
        connect();
    }
}
