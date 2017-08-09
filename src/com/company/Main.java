package com.company;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Javaica Converter");
        showMainMenu();
    }

    public static int input() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int inputNumber = reader.nextInt();
        return inputNumber;
    }

    public static void showMainMenu() {

        System.out.println("");
        System.out.println("You can choose from the following options:");
        System.out.println("(1) Currency converter");
        System.out.println("(2) Distance converter");
        System.out.println("(3) Weight converter");
        System.out.println("(4) Temperature converter");
        System.out.printf("");
        chooseMenu(input());
    }

    public static void chooseMenu(int number) {
        switch (number) {
            case 1:
                System.out.printf("Currency converter menu");
                System.out.println("");
                System.out.println("Please choose from the following options:");
                System.out.println("(1) HUF to EUR");
                System.out.println("(2) EUR to HUF");
                System.out.println("(3) HUF to USD");
                System.out.println("(4) Check the daily exchange rate");
                System.out.println("(0) Go back to Main Menu");
                // currencyConverter(input());

                break;
            case 2:
                System.out.println("Distance converter menu");
                break;
            case 3:
                System.out.println("Weight converter menu");
                break;
            case 4:
                System.out.println("Temperature converter menu");
                break;
            default:
                System.out.println("Please choose from option: 1,2,3 or 4");
                showMainMenu();
                break;

        }
    }

    public static void currencyConverter(int number) {
        switch (number) {
            case 1:
                System.out.println("You are in the HUF to EUR exchanger menu");
                System.out.printf("");
                System.out.println("Please enter your amount of HUF");
                int hufAmount = input();
                double euroAmount = (double) hufAmount / 300;   // 300 should be a variable (euroToday)
                System.out.println(hufAmount + " HUF today equals with " + euroAmount + " EUR");
                break;
        }
    }

    currencyConverter hufToEuro = new currencyConverter();
    hufToEuro.setHuf(100000);
}
