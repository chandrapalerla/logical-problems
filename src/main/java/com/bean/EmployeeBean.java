package com.bean;

public class EmployeeBean implements Comparable {

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

  public int getEmpID() {
    return empID;
  }

  public void setEmpID(int empID) {
    this.empID = empID;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  @Override
  public String toString() {
    return "EmployeeBean{" +
        "empID=" + empID +
        ", empName='" + empName + '\'' +
        ", dept='" + dept + '\'' +
        ", salary=" + salary +
        ", emailId='" + emailId + '\'' +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
