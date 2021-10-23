package com.codegym;

import manager.MenuManager;
import model.Car;
import model.Motorbike;
import service.VehicleManager;

import java.util.Scanner;

import static manager.MenuManager.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            showMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    MenuManager.addVehicle();
                    break;
                case 2:
                    vehicleManager.print();
                    break;
                case 3:
                    MenuManager.listMotorbike(vehicleManager).print();
                    break;
                case 4:
                    MenuManager.lisCar(vehicleManager).print();
                    break;
                case 5:
                    MenuManager.findVehicle();
                    break;
                case 6:
                    MenuManager.deleteVehicle();
                    break;
                case 7:
                    MenuManager.updateVehicle();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }


}
