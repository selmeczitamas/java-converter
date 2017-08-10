package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        convertTemperature();
    }


    public static int getInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter a selected number or any key to exit ");
        int inputNumber = -1;
        try {
            inputNumber = reader.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("");
        }
        return inputNumber;
    }


    public static void convertTemperature() {

        System.out.println("");
        System.out.println("You can choose from the following options:");
        System.out.println("(1) Convert degree from Fahrenheit to Celsius");
        System.out.println("(2) Convert degree from Celsius to Fahrenheit");
        System.out.println("Press anything to go back to main Menu");

        int selected = getInput();

        if (selected == 1) {
            System.out.println("Enter a degree in Fahrenheit:");
            fahrenheitToCelsius();
        }
        else if (selected == 2) {
            System.out.println("Enter a degree in Celsius:");
            celsiusToFahrenheit();
        }
        else {
            System.out.println("Intrested in other features? ");
        }
    }

    private static void celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        double Celsius = input.nextDouble();
        System.out.println(Celsius + " in Celsius is " + ((Celsius * 1.8) + 32)
                + " in Fahrenheit");
        convertTemperature();
    }

    private static void fahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        double Fahrenheit = input.nextDouble();
        System.out.println(Fahrenheit + " in Fahrenheit is " + ((Fahrenheit - 32) * (5 / 9.0))
            + " in Celsius");
        convertTemperature();
    }
}

