package lab5.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Employee> employees = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Number of employees:");
        var numberOfEmployeesToBeRead = in.nextInt();
        for (int i = 1; i <= numberOfEmployeesToBeRead; i++) {
            var employee = readEmployee(i);
            employees.add(employee);
        }

        employees.forEach(employee -> {
            System.out.println(employee.calculateMonthlyIncome());
        });
    }

    private static Employee readEmployee(int theNthEmployee) {
        System.out.printf("Name of the %d employee is : %n", theNthEmployee);
        var nameOfEmployee = in.next();
        System.out.printf("Email of the %d employee is : %n", theNthEmployee);
        var emailOfEmployee = in.next();
        System.out.printf("Hour rate of the %d employee is : %n", theNthEmployee);
        var hourRateOfEmployee = in.nextFloat();
        System.out.printf("Capacity of the %d employee is : %n", theNthEmployee);
        var capacityOfEmployee = in.nextFloat();
        System.out.printf("Free days of the %d employee is : %n", theNthEmployee);
        var freeDaysOfEmployee = in.nextShort();
        var employee = new Employee(nameOfEmployee, emailOfEmployee, hourRateOfEmployee, capacityOfEmployee, freeDaysOfEmployee);
        return employee;
    }
}
