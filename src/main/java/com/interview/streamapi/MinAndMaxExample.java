package com.interview.streamapi;


import com.bean.EmployeeBean;
import com.utility.TestData;
import java.util.Comparator;
import java.util.List;

public class MinAndMaxExample {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(12, 3, 4, 5, 6, 13, 45, 67);

        //Max element by integer number
//        Integer integer = integerList.stream().max(Comparator.comparing(Function.identity())).get();
//        System.out.println(integer);
//
//        //Min element by integer numbers
//        Integer integer1 = integerList.stream().min(Comparator.comparing(Function.identity())).get();
//        System.out.println(integer1);

        List<String> alphabet =
                List.of("alfa", "bravo", "charlie", "delta", "echo",
                        "foxtrot", "golf", "hotel", "india", "juliet",
                        "kilo", "lima", "mike", "november", "oscar",
                        "papa", "quebec", "romeo", "sierra", "tango",
                        "uniform", "victor", "whiskey", "x-ray", "yankee",
                        "zulu");

        //max value string
        String maxValueString = alphabet.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(maxValueString);

        //min value string
        String minValueOfString = alphabet.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(minValueOfString);

        //FInd max salary from employee list

        List<EmployeeBean> employeeBeanList = TestData.getEmployeeData();

        String maxSalaryEmpName = employeeBeanList.stream()
                .max(Comparator.comparing(EmployeeBean::getSalary))
                .map(EmployeeBean::getEmpName).get();
        System.out.println(maxSalaryEmpName);

        //find min salary from employee list
        String minSalaryEmpName = employeeBeanList.stream()
                .min(Comparator.comparing(EmployeeBean::getSalary))
                .map(EmployeeBean::getEmpName)
                .get();
        System.out.println(minSalaryEmpName);
    }
}
