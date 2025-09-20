package com.utility;


import com.bean.City;
import com.bean.EmployeeBean;
import com.bean.Product;
import com.bean.User;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class TestData {

  public static List<EmployeeBean> getEmployeeData() {
    List<EmployeeBean> employeeBeanList = new ArrayList<>();

    employeeBeanList.add(new EmployeeBean(10, "pavel", "it", 56776.67, "pavel@gmail.com"));
    employeeBeanList.add(new EmployeeBean(11, "mikalai", "admin", 25879.67, "mikalai@gmail.com"));
    employeeBeanList.add(new EmployeeBean(12, "donald", "it", 85000.67, "donald@gmail.com"));
    employeeBeanList.add(new EmployeeBean(13, "onac", "central", 25879.67, "onac@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(14, "ragav", "central", 12500.67, "ragav@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(15, "maset", "non-it", 76700.67, "maset@yahoo.com"));
    employeeBeanList.add(new EmployeeBean(16, "hancy", "it", 55000, "hancy@gmail.com"));

    return employeeBeanList;

  }

  public static List<String> getNamesList() {
    List<String> names = new ArrayList<>();

    names.add("donald");
    names.add("chandu");
    names.add("pavani");
    names.add("pavel");
    names.add("kaushik");

    return names;
  }

  public static List<Integer> getNumberList() {
    List<Integer> numbers = new ArrayList<>();

    numbers.add(12);
    numbers.add(6);
    numbers.add(14);
    numbers.add(5);

    return numbers;
  }

  public static Map<Integer, String> getNamesMap() {
    Map<Integer, String> integerStringMap = new HashMap<>();

    integerStringMap.put(1, "donald");
    integerStringMap.put(2, "chandu");
    integerStringMap.put(3, "pavel");

    return integerStringMap;
  }

  public static Map<EmployeeBean, Integer> getEmployeeMapData() {

    Map<EmployeeBean, Integer> employeeBeanIntegerMap = new HashMap<>();
    employeeBeanIntegerMap.put(new EmployeeBean(10, "donals", "It", 45000, "donals@gmail.com"), 10);
    employeeBeanIntegerMap.put(new EmployeeBean(43, "maike", "It", 56000, "maike@yahoo.com"), 11);
    employeeBeanIntegerMap.put(new EmployeeBean(56, "roch", "Admin", 15000, "roch@gmail.com"), 11);
    employeeBeanIntegerMap.put(new EmployeeBean(5, "surya", "admin", 25000, "surya@yahoo.com"), 12);
    employeeBeanIntegerMap.put(new EmployeeBean(60, "umran", "Staff", 65000, "umran@gmail.com"),
        13);

    return employeeBeanIntegerMap;
  }

  public static List<User> getUserData() {
    List<User> users = new ArrayList<>();

    users.add(new User("devil mikel", Arrays.asList(9645565, 897678, 657677878)));
    users.add(new User("kapil", Arrays.asList(656565656, 787787878, 656565656, 787787878)));
    users.add(new User("maxim", Arrays.asList(878765454, 676765, 45456576, 565676778)));

    return users;
  }

  public static List<List<Integer>> getPhoneNumbers() {

    List<Integer> list1 = Arrays.asList(9645565, 897678, 657677878);
    List<Integer> list = Arrays.asList(656565656, 787787878);
    List<Integer> list2 = Arrays.asList(878765454, 676765, 45456576, 565676778);

    return List.of(list1, list, list2);

  }

  public static List<String> getAlphabet() {
    return List.of("alfa", "bravo", "bravo", "charlie", "delta");
  }

  public static List<String> getSonnet() {
    return List.of(
        "From fairest creatures we desire increase,",
        "That thereby beauty's rose might never die,",
        "But as the riper should by time decease,",
        "His tender heir might bear his memory:",
        "But thou contracted to thine own bright eyes,",
        "Feed'st thy light's flame with self-substantial fuel,",
        "Making a famine where abundance lies,",
        "Thy self thy foe, to thy sweet self too cruel:",
        "Thou that art now the world's fresh ornament,",
        "And only herald to the gaudy spring,",
        "Within thine own bud buriest thy content,",
        "And, tender churl, mak'st waste in niggarding:",
        "Pity the world, or else this glutton be,",
        "To eat the world's due, by the grave and thee.");
  }

  public static List<String> expand(String s) {
    return s.codePoints()
        .mapToObj(codePoint -> Character.toString((char) codePoint))
        .collect(toList());
  }

  public static List<City> prepareTemperature() {
    List<City> cities = new ArrayList<>();

    cities.add(new City("New Delhi", 33.5));
    cities.add(new City("Mexico", 14));
    cities.add(new City("New York", 13));
    cities.add(new City("Dubai", 43));
    cities.add(new City("London", 15));
    cities.add(new City("Alaska", 1));
    cities.add(new City("Kolkata", 30));
    cities.add(new City("Sydney", 11));
    cities.add(new City("Mexico", 14));
    cities.add(new City("Dubai", 43));

    return cities;
  }

  public static List<Product> getProducts() {
    return Arrays.asList(
        new Product("Milk", 37, 3.60, 12345600L),
        new Product("Carton of Eggs", 50, 1.20, 12378300L),
        new Product("Olive oil", 28, 37.0, 13412300L),
        new Product("Peanut butter", 33, 4.19, 15121200L),
        new Product("Bag of rice", 26, 1.70, 21401265L)
    );
  }
}
