package com.interview.streamapi;

import com.bean.User;

import com.utility.TestData;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<User> userData = TestData.getUserData();
        List<String> userNames = userData.stream()
            .map(User::getUserName)
            .collect(Collectors.toList());
        System.out.println(userNames);

        List<List<Integer>> phoneNumbers = userData.stream()
            .map(User::getPhoneNumbers)
            .collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }
}
