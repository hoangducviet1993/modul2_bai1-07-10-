package service;

import model.Staff;

import java.util.ArrayList;

public class StaffManager implements StaffService<Staff> {
    private ArrayList<Staff> staffList;
    private int count = 0;

    public StaffManager() {
        this.staffList = new ArrayList<>();
    }

    @Override
    public void add(Staff staff) {
        staff.setId(count);
        count++;
        staffList.add(staff);

    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findIndexByName(String name) {
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(Staff staff, int id) {
        if (findIndexById(id) != -1) {
            staffList.set(findIndexById(id), staff);
        } else {
            System.out.println("Không có nhân viên cần sửa: ");
        }

    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            staffList.remove(findIndexById(id));
        } else {
            System.out.println("Không có nhân viên cần xóa: ");
        }
    }

    @Override
    public void print() {
        for (Staff staff : staffList) {
            System.out.println(staff);
        }
    }

    public double calSalaryPartTime() {
        double sum = 0;
        for (Staff staff : staffList) {
            if (staff.getType().equals("PartTime")) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }

    public double calSalaryFullTime() {
        double sum = 0;
        for (Staff staff : staffList) {
            if (staff.getType().equals("FullTime")) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }

    public void filterPartTimeStaff() {
        for (Staff staff : staffList) {
            if (staff.getType().equals("PartTime")) {
                System.out.println(staff);
            }
        }
    }

    public void filterFullTimeStaff() {
        for (Staff staff : staffList) {
            if (staff.getType().equals("FullTime")) {
                System.out.println(staff);
            }
        }
    }

}
