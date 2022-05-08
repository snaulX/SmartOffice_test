package com.mnolimp.m;

import com.sun.deploy.net.MessageHeader;
import sun.net.www.http.HttpClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
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

    static HttpURLConnection connection;
    static String urlParameters = "coffee/0/name";

    public static void connectToServer() throws IOException {

        //HttpClient client = HttpClient.New(new URL("http://127.0.0.1:5000/coffee/0/name"));


        URL url = new URL("http://127.0.0.1:5000/coffee/0/name");
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setConnectTimeout(10000);

        System.out.println("Send 'HTTP GET' request to : " + url);

        Integer responseCode = connection.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader inputReader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = inputReader.readLine()) != null) {
                response.append(inputLine);
            }

            inputReader.close();

            System.out.println(response.toString());
        }
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
        connectToServer();
    }
}
