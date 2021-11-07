package service;

import model.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarManager extends VehicleManager{
    private ArrayList<Car> carList;

    public CarManager() {
        this.carList = new ArrayList<>();
    }
    public static Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Oto cần thêm: ");
        System.out.println("__________");
        System.out.println("Nhập hãng xe: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập màu xe: ");
        String color = scanner.nextLine();
        System.out.println("Nhập số chỗ: ");
        int seats = scanner.nextInt();
        System.out.println("Nhập giá Xe:");
        int price = scanner.nextInt();
        return new Car(brand, color, price, seats);
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void print() {
        for (Car car:carList) {
            System.out.println(car);
        }
    }

    public void sortByPrice() {
    }

    public void readCarList(String s) {
    }

    public void writeCarList(String s) {
    }
}
