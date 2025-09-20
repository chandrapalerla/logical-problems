package com.bean;

import java.util.List;


public class User {

  private String userName;
  private List<Integer> phoneNumbers;
  public User(String userName, List<Integer> phoneNumbers) {
    this.userName = userName;
    this.phoneNumbers = phoneNumbers;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public List<Integer> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Integer> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  @Override
  public String toString() {
    return "User{" +
        "userName='" + userName + '\'' +
        ", phoneNumbers=" + phoneNumbers +
        '}';
  }
}
