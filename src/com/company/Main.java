package com.company;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Javaica Converter Application");
        showMainMenu();
    }

    public static int input(String printOutMessage) {
        Scanner reader = new Scanner(System.in);
        System.out.println(printOutMessage);
        int inputNumber = -1;
        try {
            inputNumber = reader.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("Error. I'm waiting for a number.");
            System.out.println("You transferred back to Main menu.");
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
                System.out.println("See you!");
                break;

            case 666:
                System.out.println("WHO ARE YOU???");
                showMainMenu();
                break;

            default:
                System.out.println("Please choose from option: 1,2,3 or 4");
                showMainMenu();
                break;
        }
    }

    public static void currencyConverterMenu() {
        System.out.println("");
        System.out.printf("Currency converter menu");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert HUF to EUR");
        System.out.println("(2) Convert EUR to HUF");
        System.out.println("(3) Check the daily exchange rate");
        System.out.println("(0) Go back to Main menu");
        moneyExchanger(input("Please Enter a number: "));
    }

    public static void distanceConverterMenu() {
        System.out.println("");
        System.out.println("Distance converter menu");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert km to miles");
        System.out.println("(2) Convert miles to km");
        System.out.println("(0) Go back to Main menu");
    }

    public static void weightConverterMenu() {
        System.out.println("");
        System.out.println("Weight converter menu");
        System.out.println("");
        System.out.println("Please choose from the following options:");
        System.out.println("(1) Convert kg to lbs");
        System.out.println("(2) Convert lbs to kg");
        System.out.println("(0) Go back to Main menu");
    }

    public static void temperatureConverterMenu() {
        System.out.println("");
        System.out.println("Temperature converter menu");
        System.out.println("");
        System.out.println("(1) Convert Celsius to Fahrenheit");
        System.out.println("(2) Convert Fahrenheit to Celsius");
        System.out.println("(0) Go back to Main menu");
    }

    public static void moneyExchanger(int exChangeableValue) {
        String printOutMsg;
        double napiEuroVetel = 304.61;
        double napiEuroEladas = 305.35;
        currencyConverter changeMe = new currencyConverter();
        switch (exChangeableValue) {

            case 1:
                changeMe.setExchangeRate(napiEuroVetel);
                printOutMsg = "Please Enter the amount of money in HUF that you want to exchange to EUR: ";
                changeMe.setHuf(input(printOutMsg));
                System.out.println(changeMe.getHuf() + " Forint a mai arfolyamon " + (changeMe.getHuf() / changeMe.getExchangeRate()) + " Euro-t er.");
                showMainMenu();
                break;

            case 2:
                changeMe.setExchangeRate(napiEuroVetel);
                printOutMsg = "Please Enter the amount of money in EUR that you want to exchange to HUF: ";
                changeMe.setEur(input(printOutMsg));
                System.out.println(changeMe.getEur() + " Euro a mai arfolyamon " + (changeMe.getEur() * changeMe.getExchangeRate()) + " Forintot er.");
                showMainMenu();
                break;

            case 3:
                System.out.println("Az aktualis Euro veteli arfolyam: " + napiEuroVetel);
                System.out.println("Az aktualis Euro eladasi arfolyam: " + napiEuroEladas);
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
//    public static void currencyConverter(int number) {
//        switch (number) {
//            case 1:
//                System.out.println("You are in the HUF to EUR exchanger menu");
//                System.out.printf("");
//                System.out.println("Please enter your amount of HUF");
//                int hufAmount = input();
//                double euroAmount = (double) hufAmount / 300;   // 300 should be a variable (euroToday)
//                System.out.println(hufAmount + " HUF today equals with " + euroAmount + " EUR");
//                break;
//        }
//    }
//
//    currencyConverter hufToEuro = new currencyConverter();
//    hufToEuro.setHuf(100000);
}
