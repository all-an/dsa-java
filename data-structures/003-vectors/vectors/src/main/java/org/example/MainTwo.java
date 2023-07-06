package org.example;

import java.io.*;
import java.util.*;

public class MainTwo extends Thread {
    public static Vector<Employee> employeeList = new Vector<>();

    public MainTwo(){
        printEmployees();
    }

    // initiated run method for Thread
    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {

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
        MainTwo mainTwo = new MainTwo();

        // Invoking Thread using start() method
        mainTwo.start();

        Thread t1 = new Thread(mainTwo);
        t1.start();
    }

    public static void printEmployees(){
        for(int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getFirstName());
        }
    }
}
