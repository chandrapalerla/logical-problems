package com.interview.streamapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Login {
    private final String username;
    private final String date;

    public Login(String username, String date) {
        this.username = username;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public String getDate() {
        return date;
    }
}

public class UserMaxLogin {

    static void main(String[] args) {

        List<Login> logins = Arrays.asList(new Login("alice", "2025-01-01"),
                new Login("alice", "2025-01-02"),
                new Login("alice", "2025-01-03"),
                new Login("alice", "2025-01-05"),
                new Login("alice", "2025-01-06"),

                new Login("bob", "2025-01-01"),
                new Login("bob", "2025-01-03"),
                new Login("bob", "2025-01-04"),
                new Login("bob", "2025-01-05"),
                new Login("bob", "2025-01-06"));

        // Group by username

        Map<String, List<LocalDate>> userLogins =
                logins.stream()
                        .collect(Collectors.groupingBy(
                                Login::getUsername,
                                Collectors.mapping(
                                        l -> LocalDate.parse(l.getDate()),
                                        Collectors.toList()
                                )
                        ));

        String user =
                userLogins.entrySet()
                        .stream()
                        .max(Comparator.comparingInt(
                                e -> calculateMaxStreak(e.getValue())
                        ))
                        .map(Map.Entry::getKey)
                        .orElse(null);

        System.out.println(user);
    }

    private static int calculateMaxStreak(List<LocalDate> dates) {
        Collections.sort(dates);
        int currentStreak = 1;
        int maxStreak = 1;
        for (int i = 1; i < dates.size(); i++) {
            long daysBetween = ChronoUnit.DAYS.between(dates.get(i - 1), dates.get(i));

            if (daysBetween == 1) {
                currentStreak++;
            } else if (daysBetween > 1) {
                currentStreak = 1;
            }
            maxStreak = Math.max(maxStreak, currentStreak);
        }

        return maxStreak;

    }
}