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
                case 1 -> processGetByPriceRequest(command);
                case 2 -> processGetByMakeModelRequest(command);
                case 3 -> processGetByYearRequest(command);
                case 4 -> processGetByColorRequest(command);
                case 5 -> processGetByMileageRequest(command);
                case 6 -> processGetByVehicleTypeRequest(command);
                case 7 -> processGetAllVehiclesRequest(command);
                case 8 -> processAddVehicleRequest(command);
                case 9 -> processRemoveVehicleRequest(command);
                case 99 -> go = false;
                default -> System.out.println("Invalid.");
            }
        }
        command.close();
    }

    public static void processGetByPriceRequest(Scanner command){

    }

    public static void processGetByMakeModelRequest(Scanner command){

    }


    public static void processGetByYearRequest(Scanner command){

    }


    public static void processGetByColorRequest(Scanner command){

    }


    public static void processGetByMileageRequest(Scanner command){

    }


    public static void processGetByVehicleTypeRequest(Scanner command){

    }


    public static void processGetAllVehiclesRequest(Scanner command){

    }


    public static void processAddVehicleRequest(Scanner command){

    }


    public static void processRemoveVehicleRequest(Scanner command){

    }

}
