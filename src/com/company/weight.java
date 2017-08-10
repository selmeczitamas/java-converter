package com.company;

import java.util.Scanner;

public class weight {



    public static void main(String[] args) {

        public void weightConverter() {
            Scanner weightInput = new Scanner();
            System.out.println("Enter 1 to convert pound to kg");
            System.out.println("Enter 2 to convert kg to pound");
            int choise = weightInput.nextInt();

            double kilogram;
            double pound;

            if (choise == 1) {
                System.out.println("Enter pound to be converted");
                pound = weightInput.nextDouble();
                kilogram = pound*0.453;
                System.out.println(pound + "is" + kilogram + "kilogram" );
            }

            if (choise == 2) {
                System.out.println("Enter kg to be converted");
                kilogram = weightInput.nextDouble();
                pound = kilogram*2.20;
                System.out.println(kilogram + "is" + pound + "kilogram" );
            }
        }

    }


}


