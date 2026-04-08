package com.interview;

import java.util.*;
import java.util.stream.*;

public class FindHighestSalaryEmployeeWithDeptWise {
    public static void main(String[] args) {
        Employee[] employees = getEmployees();
        Arrays.stream(employees)
                .collect(Collectors.groupingBy(emp -> emp.dept, Collectors.maxBy(Comparator.comparingInt(emp -> emp.salary))))
                .forEach((dept, emp) -> System.out.println("Department: " + dept + ", " + emp.get().name + " ," + emp.get().salary));

    }

    private static Employee[] getEmployees() {
        Employee employee1 = new Employee("chandra", 10000, "IT");
        Employee employee2 = new Employee("shekar", 20000, "IT");
        Employee employee3 = new Employee("suresh", 30000, "HR");
        Employee employee4 = new Employee("ramesh", 40000, "HR");
        Employee employee5 = new Employee("rajesh", 50000, "SALES");
        Employee employee6 = new Employee("mahesh", 60000, "SALES");

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};
        return employees;
    }
}

class Employee {
    String name;
    int salary;
    String dept;

    public Employee(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
}
