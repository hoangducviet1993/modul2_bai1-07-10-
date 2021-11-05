package service;

import model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarManager extends VehicleManager {
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
        for (Car car : carList) {
            System.out.println(car);
        }
    }
    public void sortByPrice(){
        Collections.sort(carList);
    }

    public void writeCarList(String nameFile) throws IOException {
        FileWriter fileWrite = new FileWriter(nameFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWrite);
        String str = "ID,Hãng Xe,Màu Xe,Giá Xe,Số Chỗ";
        for (Car car : carList) {
            str += "\n";
            str += car.getId() + ",";
            str += car.getBrand() + ",";
            str += car.getColor() + ",";
            str += car.getPrice() + ",";
            str += car.getSeats();
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }

    public void readCarList(String nameFile) throws IOException {
        FileReader fileReader = new FileReader(nameFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] array = content.split(",");
//            int id = Integer.parseInt(array[0]);
            String brand = array[1];
            String color = array[2];
            int price = Integer.parseInt(array[3]);
            int seats = Integer.parseInt(array[4]);
            Car car = new Car(brand, color, price, seats);
            carList.add(car);
            car.setId(Integer.parseInt(array[0]));
        }
        bufferedReader.close();
    }

}
