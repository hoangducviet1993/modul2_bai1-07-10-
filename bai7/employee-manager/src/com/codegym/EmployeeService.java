package com.codegym;

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
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee, int id) {

    }

    @Override
    public void deleteById(Employee employee) {

    }
}
