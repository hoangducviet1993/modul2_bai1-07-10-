package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
    BossService bossService1 = new BossService();
    Boss boss1 = new Boss(01,"Hoàng",28,3);
    Boss boss2 = new Boss(02,"Việt",27,2);
    bossService1.add(boss1);
    bossService1.add(boss2);
    EmployeeService employeeService1 = new EmployeeService();
    Employee employee1 = new Employee(03,"nvA",20,5000);
    Employee employee2 = new Employee(03,"nvB",22,6000);
    Employee employee3 = new Employee(03,"nvC",23,7000);
    Employee employee4 = new Employee(03,"nvD",21,9000);
    Employee employee5 = new Employee(03,"nvE",18,5000);
    employeeService1.add(employee1);
    employeeService1.add(employee2);
    employeeService1.add(employee3);
    employeeService1.add(employee4);
    employeeService1.add(employee5);
    bossService1.print();
        System.out.println("...............................................");
    employeeService1.print();
    }
}
