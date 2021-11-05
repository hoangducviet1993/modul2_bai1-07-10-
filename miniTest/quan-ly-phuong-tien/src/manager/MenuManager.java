package manager;


import model.Car;
import model.Motorbike;
import model.Vehicle;
import service.CarManager;
import service.MotorbikeManager;
import service.VehicleManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuManager {
    public static VehicleManager vehicleManager = new VehicleManager();

    public static void showMenu() {
        System.out.println("===========Menu===========");
        System.out.println("1. Thêm phương tiện: ");
        System.out.println("2. In danh sách các phương tiện: ");
        System.out.println("3. In danh sách Xe Máy: ");
        System.out.println("4. In danh sách Oto: ");
        System.out.println("5. Tìm kiếm phương tiện theo ID");
        System.out.println("6. Xóa phương tiện: ");
        System.out.println("7. Sửa phương tiện: ");
        System.out.println("8. Sắp xếp phương tiện");
        System.out.println("9. Rei xinh đẹp");
        System.out.println("10. Rei Dog");
        System.out.println("0. Thoát: ");
        System.out.println("Nhập sự lựa chọn");
    }

    public static void addVehicle() {
        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Thêm xe máy: ");
            System.out.println("2. Thêm Oto: ");
            System.out.println("0. Thay dổi lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    vehicleManager.add(MotorbikeManager.createMotorbike());
                    break;
                case 2:
                    vehicleManager.add(CarManager.createCar());
                    break;
                case 0:
                    System.out.println("Nhập lựa chọn tiếp theo: ");

                default:
                    System.out.println("Không có lựa chọn mời chọn lại: ");
            }
        }
    }

    public static MotorbikeManager listMotorbike(VehicleManager vehicleManager) {
        MotorbikeManager motorbike1 = new MotorbikeManager();
        ArrayList<Motorbike> findMotorbike = new ArrayList<>();
        for (int i = 0; i < vehicleManager.getSize(); i++) {
            if (vehicleManager.getVehicleList().get(i) instanceof Motorbike) {
                Motorbike motorbike = (Motorbike) vehicleManager.getVehicleList().get(i);
                findMotorbike.add(motorbike);
            }
        }
        motorbike1.setMotorbikesList(findMotorbike);
        return motorbike1;
    }

    public static CarManager lisCar(VehicleManager vehicleManager) {
        CarManager car1 = new CarManager();
        ArrayList<Car> findCar = new ArrayList<>();
        for (int i = 0; i < vehicleManager.getSize(); i++) {
            if (vehicleManager.getVehicleList().get(i) instanceof Car) {
                Car car = (Car) vehicleManager.getVehicleList().get(i);
                findCar.add(car);
            }
        }
        car1.setCarList(findCar);
        return car1;
    }

    public static void findVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id phương tiện cần tim: ");
        int id = scanner.nextInt();
        vehicleManager.findById(id);
    }

    public static void deleteVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id phương tiện cần xóa: ");
        int id = scanner.nextInt();
        vehicleManager.delete(id);
    }

    public static void updateVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id phương tiện cần sửa: ");
        int id = scanner.nextInt();
        int index = vehicleManager.findIndexById(id);
        if (index != -1) {
            if (vehicleManager.getVehicleList().get(index) instanceof Motorbike) {
                Motorbike motorbike = MotorbikeManager.createMotorbike();
                vehicleManager.update(motorbike, id);
                motorbike.setId(id);
            }
            if (vehicleManager.getVehicleList().get(index) instanceof Car) {
                Car car = CarManager.createCar();
                vehicleManager.update(car, id);
                car.setId(id);
            }
        } else {
            System.out.println("Id không tồn tại:");
        }

    }

    public static void writeCarToFile() throws IOException {
        CarManager carList = lisCar(vehicleManager);
        carList.writeCarList("carlist.csv");
    }

    public static void printFromFile() throws IOException {
        CarManager carList = lisCar(vehicleManager);
        carList.readCarList("carlist.csv");
        carList.print();
    }
    public static void sortCarByPrice(){
        CarManager carList = lisCar(vehicleManager);
        carList.sortByPrice();
        carList.print();
    }
}
