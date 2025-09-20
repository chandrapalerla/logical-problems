package com.interview;

import com.bean.EmployeeBean;
import com.utility.TestData;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeProblems {

  public static void main(String[] args) {

    List<EmployeeBean> employees = TestData.getEmployeeData();

//    Problem 1: Department-wise Employee Count
    Map<String, Long> deptCount = employees
        .stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept, Collectors.counting()));
    System.out.println("deptCount:::::::" + deptCount);

//    Problem 2: Average Salary by Department
    Map<String, Double> deptAverageSalary = employees
        .stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept,
            Collectors.averagingDouble(EmployeeBean::getSalary)));
    System.out.println("deptAverageSalary:::::" + deptAverageSalary);

//    Problem 3: Group Employees by Department and List Their Names
    Map<String, List<String>> deptAndNames = employees
        .stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept,
            Collectors.collectingAndThen(Collectors.mapping(EmployeeBean::getEmpName,
                Collectors.toList()), emp -> emp)));
    System.out.println("deptAndNames:::::" + deptAndNames);

//    Problem 4: Employee with the Highest Salary in Each Department

    Map<String, Double> maxSalaryMap = employees.stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept,
            Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingDouble(EmployeeBean::getSalary)),
                emp -> emp.get().getSalary())));
    System.out.println("maxSalaryMap::::" + maxSalaryMap);

//    Problem 5: Total Salary by Department
    Map<String, Double> deptAndTotalSalary = employees
        .stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept,
            Collectors.summingDouble(EmployeeBean::getSalary)));
    System.out.println("deptAndTotalSalary::::::" + deptAndTotalSalary);

//    Problem 6: Employees Grouped by First Letter of Their Name

    Map<String, String> groupByNameFirstLetter = employees
        .stream()
        .collect(Collectors.groupingBy(employeeBean -> employeeBean.getEmpName().substring(0, 1)
            , Collectors.mapping(EmployeeBean::getEmpName, Collectors.joining(","))));

    System.out.println("groupByNameFirstLetter:::::" + groupByNameFirstLetter);

//    Problem 7: Partition Employees by Salary Threshold

    Map<Boolean, List<EmployeeBean>> partitionByEmployeeSalary = employees
        .stream()
        .collect(Collectors.partitioningBy(employeeBean -> employeeBean.getSalary() > 72500.67));
    System.out.println("partitionByEmployeeSalary::::::" + partitionByEmployeeSalary);

//    Problem 8: Department-wise Employee Salary Statistics
    Map<String, DoubleSummaryStatistics> deptSalaryStatistics = employees
        .stream()
        .collect(Collectors.groupingBy(EmployeeBean::getDept,
            Collectors.summarizingDouble(EmployeeBean::getSalary)));
    System.out.println("deptSalaryStatistics:::::" + deptSalaryStatistics);

//    Problem 9: Find Departments with All Employees Earning Above a Certain Salary
    Set<String> deptCertainSalary = employees
        .stream()
        .filter(emp -> emp.getSalary() > 26000)
        .map(EmployeeBean::getDept)
        .collect(Collectors.toSet());
    System.out.println("deptCertainSalary:::::" + deptCertainSalary);

//    Problem 10: Map of Employees Grouped by Department and Sorted by Salary
    Map<String, List<EmployeeBean>> deptSortedSalary = employees
        .stream()
        .sorted(Comparator.comparingDouble(EmployeeBean::getSalary))
        .collect(Collectors.groupingBy(EmployeeBean::getDept));

    System.out.println("deptSortedSalary::::::::" + deptSortedSalary);

//    reduce Method Exmaples:
//    Problem 1: Sum of All Salaries
//    Problem 2: Longest Employee Name
//    Problem 3: Highest Salary
//    Problem 4: Concatenate All Employee Names
//    Problem 5: Total Number of Characters in All Employee Names
//    Problem 6: Employee with the Highest Salary
//    Problem 7: Average Salary Using reduce
//    Problem 8: Employee with the Lowest Salary
//    Problem 9: Total Tenure of All Employees
//    Problem 10: Department with the Longest Name
//    Problem 11: Product of All Salaries
//    Problem 12: Employee with the Shortest Name
//    Problem 13: Count Employees Earning Above a Certain Salary
//    Problem 14: Combine All Employee IDs into a Single List
//    Problem 15: Find the Department with the Most Employees
//    Problem 16: Sum of Salaries of Employees in a Specific Department
//    Problem 17: Difference Between Highest and Lowest Salaries
//    Problem 18: Employee with the Most Tenure
//    Problem 19: Concatenate Employee Names by Department
//    Problem 20: Count of Employees with Tenure Above a Certain Number of Years

    String str = "aaabbaanjkkllaajjaaabbnj";
    String collect = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    System.out.println(collect);

  }
}
