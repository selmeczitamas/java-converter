package com.company;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Welcome to Javaica Converter Application");
        System.out.println("----------------------------------------");
        showMainMenu();
    }

    public static int input(String printOutMessage) {
        Scanner reader = new Scanner(System.in);
        System.out.println(printOutMessage);
        int inputNumber = -1;
        try {
            inputNumber = reader.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("----------------------------------------");
            System.out.println("Error. I'm waiting for a number.");
            System.out.println("You transferred back to Main menu.");
            System.out.println("----------------------------------------");
            showMainMenu();
        }
        return inputNumber;
    }

    public static void showMainMenu() {

        System.out.println("");
        System.out.println("You can choose from the following options:");
        System.out.println("(1) Currency converter");
        System.out.println("(2) Distance converter");
        System.out.println("(3) Weight converter");
        System.out.println("(0) Exit");
        System.out.println("");
        chooseMainMenu(input("Please Enter a number: "));
    }



    public static void chooseMainMenu(int number) {
        switch (number) {

            case 1:
                currencyConverterMenu();
                break;

            case 2:
                distanceConverterMenu();
                break;

            case 3:
                weightConverterMenu();
                break;

            case 4:
                temperatureConverterMenu();
                break;

            case 0:
                System.out.println("----------------------------------------");
                System.out.println("See you! Bye! :)");
                System.out.println("----------------------------------------");
                System.exit(0);
                break;

            case 666:
                System.out.println("----------------------------------------");
                System.out.println("WHO ARE YOU???");
                System.out.println("----------------------------------------");
                showMainMenu();
                break;

            default:
                System.out.println("Please choose from option: 1,2,3 or 4");
                showMainMenu();
                break;
        }
    }

    public static void currencyConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Currency converter menu");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert HUF to EUR");
        System.out.println("(2) Convert EUR to HUF");
        System.out.println("(3) Check the daily exchange rate");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
        moneyExchanger(input("Please Enter a number: "));
    }

    public static void distanceConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Distance converter menu");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert km to miles");
        System.out.println("(2) Convert miles to km");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
    }

    public static void weightConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Weight converter menu");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert kg to lbs");
        System.out.println("(2) Convert lbs to kg");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
    }

    public static void temperatureConverterMenu() {
        System.out.println("----------------------------------------");
        System.out.println("Temperature converter menu");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("(1) Convert Celsius to Fahrenheit");
        System.out.println("(2) Convert Fahrenheit to Celsius");
        System.out.println("(0) Go back to Main menu");
        System.out.println("");
    }

    public static void moneyExchanger(int exChangeableValue) {
        String printOutMsg;
        double dailyEuroRate = 304.61;
        currencyConverter changeMe = new currencyConverter();
        switch (exChangeableValue) {

            case 1:
                changeMe.setExchangeRate(dailyEuroRate);
                printOutMsg = "Please Enter the amount of money in HUF that you want to exchange to EUR: ";
                changeMe.setHuf(input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getHuf() + " Forint equals to " + (changeMe.getHuf() / changeMe.getExchangeRate()) + " Euro.");
                System.out.println("----------------------------------------");
                showMainMenu();
                break;

            case 2:
                changeMe.setExchangeRate(dailyEuroRate);
                printOutMsg = "Please Enter the amount of money in EUR that you want to exchange to HUF: ";
                changeMe.setEur(input(printOutMsg));
                System.out.println("----------------------------------------");
                System.out.println(changeMe.getEur() + " Euro equals to " + (changeMe.getEur() * changeMe.getExchangeRate()) + " HUF.");
                System.out.println("----------------------------------------");
                showMainMenu();
                break;

            case 3:
                System.out.println("----------------------------------------");
                System.out.println("The current Euro exchange rate is: " + dailyEuroRate);
                System.out.println("----------------------------------------");
                currencyConverterMenu();
                break;

            case 0:
                showMainMenu();
                break;

            default:
                currencyConverterMenu();
                break;
        }
    }
}
