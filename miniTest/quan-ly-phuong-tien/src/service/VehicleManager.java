package service;

import model.Car;
import model.Motorbike;
import model.Vehicle;

import java.util.ArrayList;

public class VehicleManager implements VehicleService<Vehicle> {
    private ArrayList<Vehicle> vehicleList;
    private int count = 0;

    public VehicleManager() {

        this.vehicleList = new ArrayList<>();
    }

//    public VehicleManager(ArrayList<Vehicle> motorbikeList) {
//        this.vehicleList = motorbikeList;
//    }

    @Override
    public void add(Vehicle vehicle) {
        vehicle.setId(count);
        count++;
        vehicleList.add(vehicle);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(Vehicle vehicle, int id) {
        if (findIndexById(id) != -1) {
            vehicleList.set(findIndexById(id), vehicle);
        } else {
            System.out.println("Không có xe cần sửa theo ID đã nhập: ");
        }

    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            vehicleList.remove(findIndexById(id));
        } else {
            System.out.println("Không có loại xe cần xóa");
        }
    }

    @Override
    public void sort() {

    }


    @Override
    public void print() {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }

    @Override
    public void findById(int id) {
        if (findIndexById(id)!=-1){
            System.out.println(vehicleList.get(findIndexById(id)));
        } else {
            System.out.println("Không có xe cần tìm: ");
        }
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public int getSize(){
        return vehicleList.size();
    }

}
