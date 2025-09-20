package com.interview.streamapi;


import com.bean.EmployeeBean;
import com.utility.TestData;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FIIndOccurrencesOfEachDomain {
    public static void main(String[] args) {

        List<EmployeeBean> employeeData = TestData.getEmployeeData();
        Map<String, Long> collect = employeeData.stream()
                .map(emp -> emp.getEmailId().split("@"))
                .collect(Collectors.groupingBy(parts -> parts[1], Collectors.counting()));
        System.out.println(collect);

    }
}
