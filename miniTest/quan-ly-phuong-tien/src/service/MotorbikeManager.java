package service;

import model.Motorbike;
import model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeManager extends VehicleManager{
    private ArrayList<Motorbike> motorbikesList;

    public MotorbikeManager() {
        this.motorbikesList =new ArrayList<>();
    }
    public static Motorbike createMotorbike() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Xe máy cần thêm: ");
        System.out.println("__________");
        System.out.println("Nhập hãng xe: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập màu xe: ");
        String color = scanner.nextLine();
        System.out.println("Nhập dung tích: ");
        int capacity = scanner.nextInt();
        System.out.println("Nhập giá Xe:");
        int price = scanner.nextInt();
        return new Motorbike(brand, color, price, capacity);
    }

    public ArrayList<Motorbike> getMotorbikesList() {
        return motorbikesList;
    }

    public void setMotorbikesList(ArrayList<Motorbike> motorbikesList) {
        this.motorbikesList = motorbikesList;
    }

    @Override
    public void print() {
        for (Motorbike motorbike : motorbikesList) {
            System.out.println(motorbike);
        }
    }
}
