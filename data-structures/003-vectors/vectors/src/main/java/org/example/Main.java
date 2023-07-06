package org.example;


import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 1));
        employeeList.add(new Employee("John", "Doe", 2));
        employeeList.add(new Employee("Mary", "Smith", 3));
        employeeList.add(new Employee("Mike", "Wilson", 4));
        employeeList.add(new Employee("Jane", "Jones", 5));
        employeeList.add(new Employee("John", "Doe", 6));
        employeeList.add(new Employee("Mary", "Smith", 7));
        employeeList.add(new Employee("Mike", "Wilson", 8));
        employeeList.add(new Employee("Jane", "Jones", 9));
        employeeList.add(new Employee("John", "Doe", 10));
        employeeList.add(new Employee("Mary", "Smith", 11));
        employeeList.add(new Employee("Zé", "Wilson", 12));

        for(int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getFirstName());
        }
    }
}