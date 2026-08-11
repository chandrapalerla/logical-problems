package com.interview.streamapi;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class MultiLevelGrouping {
    public static void main(String[] args) {

        // Group employees by department and then by designation, preserving insertion order
        var groupedEmployees = getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::department, LinkedHashMap::new,
                        Collectors.groupingBy(Employee::designation, LinkedHashMap::new,
                                Collectors.mapping(Employee::name, Collectors.toList()))));

        groupedEmployees.forEach((dept, roles) -> {
            System.out.println(dept);
            roles.forEach((designation, names) -> {
                System.out.println("   " + designation + " -> " + names);
            });
            System.out.println();
        });
    }

    private static List<Employee> getEmployees() {
        return List.of(
                new Employee(1,"John","IT","Architect",180000,42),
                new Employee(2,"David","IT","Developer",120000,30),
                new Employee(3,"Sam","IT","Developer",110000,29),
                new Employee(4,"Peter","HR","Manager",150000,40),
                new Employee(5,"Mary","HR","Recruiter",90000,28),
                new Employee(6,"Lisa","Finance","Analyst",95000,31),
                new Employee(7,"Tom","Finance","Manager",170000,44)
        );
    }
}

record Employee(
        int id,
        String name,
        String department,
        String designation,
        double salary,
        int age) {}
