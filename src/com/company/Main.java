package com.company;
import java.util.*;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Javaica Converter");
        showMainMenu();
    }

    public static void showMainMenu() {

        System.out.println("");
        System.out.println("You can choose from the following options:");
        System.out.println("(1) Currency converter");
        System.out.println("(2) Distance converter");
        System.out.println("(3) Weight converter");
        System.out.println("(4) Temperature converter");
        System.out.printf("");

        Scanner reader = new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int number = reader.nextInt();
        System.out.println("You choose number " + number);
        chooseMenu(number);
    }


}
