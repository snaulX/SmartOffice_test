package com.mnolimp.m;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CoffeeMachine {
    static HttpURLConnection connection;
    static String urlParameters = "coffee/0/name";

    static JButton buttonPrepareCoffee = new JButton("Сделать кофе");
    static JButton buttonNoCoffee = new JButton("Нет кофейных зёрен");
    static JButton buttonNoMilk = new JButton("Нет молока");
    static JButton buttonNoWater = new JButton("Нет воды");
    static JButton buttonDirty = new JButton("Загрязнена");
    static JButton buttonNoBreakdowns = new JButton("Исправна");

    public static void setCoffeeMachineLabel(){
        setCoffeeMachineColor();
        Main.panelRight.add(buttonPrepareCoffee);
        Main.panelRight.add(buttonNoCoffee);
        Main.panelRight.add(buttonDirty);
        Main.panelRight.add(buttonNoMilk);
        Main.panelRight.add(buttonNoWater);
        Main.panelRight.add(buttonNoBreakdowns);
    }

    public static void setCoffeeMachineColor(){
        setCoffeeClickListeners();

        buttonPrepareCoffee.setBackground(Color.WHITE);
        buttonNoCoffee.setBackground(Color.RED);
        buttonNoMilk.setBackground(Color.RED);
        buttonNoWater.setBackground(Color.RED);
        buttonDirty.setBackground(Color.RED);
        buttonNoBreakdowns.setBackground(Color.WHITE);
    }

    public static void setCoffeeClickListeners(){
        buttonPrepareCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/make");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "latte";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonNoCoffee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/status");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "No coffee";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonNoMilk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/status");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "No milk";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonNoWater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/status");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "No water";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonDirty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/status");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "Dirty";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        buttonNoBreakdowns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    URL url = new URL("http://127.0.0.1:5000/coffee/0/status");

                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("Content-Type", "text/plain");
                    connection.setDoOutput(true);

                    DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

                    String urlPostParameters = "Correct";
                    outputStream.writeBytes(urlPostParameters);

                    outputStream.flush();
                    outputStream.close();

                    System.out.println("Send 'HTTP POST' request to : " + url);

                    int responseCode = connection.getResponseCode();
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
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
