package com.interview.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A1Q13 {
    public static void main(String args[]) {
        List<EmployeeBean> employeeBeanList = new ArrayList<>();

        employeeBeanList.add(new EmployeeBean(10, "pavel", "it", 56776.67, "pavel@gmail.com"));
        employeeBeanList.add(new EmployeeBean(11, "mikalai", "admin", 25879.67, "mikalai@gmail.com"));
        employeeBeanList.add(new EmployeeBean(12, "donald", "it", 85000.67, "donald@gmail.com"));
        employeeBeanList.add(new EmployeeBean(13, "onac", "central", 25879.67, "onac@yahoo.com"));
        employeeBeanList.add(new EmployeeBean(14, "ragav", "central", 12500.67, "ragav@yahoo.com"));
        employeeBeanList.add(new EmployeeBean(15, "maset", "non-it", 76700.67, "maset@yahoo.com"));
        employeeBeanList.add(new EmployeeBean(16, "hancy", "it", 55000, "hancy@gmail.com"));

        System.out.println(employeeBeanList.stream().collect(Collectors.groupingBy(EmployeeBean -> EmployeeBean, Collectors.counting())));
    }
    static class EmployeeBean {
        private int empID;
        private String empName;
        private String dept;
        private double salary;
        private String emailId;
        public EmployeeBean(int empID, String empName, String dept, double salary, String emailId) {
            this.empID = empID;
            this.empName = empName;
            this.dept = dept;
            this.salary = salary;
            this.emailId = emailId;
        }
    }
}
 