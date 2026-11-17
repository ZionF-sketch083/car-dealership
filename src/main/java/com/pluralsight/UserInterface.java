package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private static final String itemsOfInterest = "inventory (1).csv";

    public static void main(String[] args) {

        Scanner command = new Scanner(System.in);
        boolean go = true;

        while (go){
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");

            int userInput = command.nextInt();

            switch (userInput){
                case 1 ->
                case 2 ->
                case 3 ->
                case 4 ->
                case 5 ->
                case 6 ->
                case 7 ->
                case 8 ->
                case 9 ->
                case 99 -> go = false;
                default -> System.out.println("");
            }
        }
        command.close();
    }

}
