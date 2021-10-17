package com.codegym;

import java.util.Arrays;

public class EmployeeService implements ManagerService<Employee>{
    private Employee[] employeesList = new Employee[5];
    private int size =0;
    @Override
    public void add(Employee employee) {
        employeesList[size]= employee;
        size++;
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employeesList[i]);
        }

    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < size; i++) {
            if (id==employeesList[i].getId()){
                return i;
            }
        }
        return 0;
    }

    @Override
    public void update(Employee employee, int id) {
        employeesList[findById(id)] = employee;
    }

    @Override
    public void sort() {
        Arrays.sort(employeesList);
    }

    @Override
    public void deleteById(int id) {
        employeesList[findById(id)] = null;
    }
}
