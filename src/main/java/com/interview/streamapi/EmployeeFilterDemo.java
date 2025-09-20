package com.interview.streamapi;



import com.bean.EmployeeBean;
import com.utility.TestData;
import java.util.List;

public class EmployeeFilterDemo {
    public static void main(String[] args) {
        List<EmployeeBean> employeeData = TestData.getEmployeeData();
        employeeData.stream()
                .filter(emp -> emp.getSalary() > 25000)
                .map(EmployeeBean::getEmpName)
                .forEach(System.out::println);

    }
}
