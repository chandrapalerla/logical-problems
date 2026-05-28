package com.interview;

import java.util.Comparator;
import java.util.List;

public class SortJiraStories {

    static void main() {

        List<String> jiraPriority = List.of("High","Medium","Low");
        List<Jira> list = getJiras().stream()
                .sorted(Comparator.comparingInt(jira -> jiraPriority.indexOf(jira.priority())))
                .toList();
        list.forEach(jira -> System.out.println(jira.priority()));

        //Unig enum
        getJiras().stream()
                        .sorted(Comparator.comparing(Jira::priority))
                .toList().forEach(jira -> System.out.println(jira.priority()));



    }

    private static List<Jira> getJiras() {
        return List.of(
                new Jira("JIRA-101", "Login page issue", "Ravi", "High"),
                new Jira("JIRA-102", "Payment gateway failure", "Anjali", "High"),
                new Jira("JIRA-103", "UI alignment problem", "Kiran", "Low"),
                new Jira("JIRA-104", "Database connection timeout", "Sneha", "High"),
                new Jira("JIRA-105", "Profile update bug", "Rahul", "Medium"),
                new Jira("JIRA-106", "Search API optimization", "Meena", "Medium"),
                new Jira("JIRA-107", "Email notification issue", "Vikas", "High"),
                new Jira("JIRA-108", "Broken image in dashboard", "Pooja", "Low"),
                new Jira("JIRA-109", "Session expiration handling", "Arun", "Medium"),
                new Jira("JIRA-110", "Security vulnerability fix", "Divya", "High"),
                new Jira("JIRA-111", "Forgot password feature", "Karthik", "Medium"),
                new Jira("JIRA-112", "Audit log enhancement", "Suresh", "Low"),
                new Jira("JIRA-113", "Kafka consumer lag issue", "Naveen", "High"),
                new Jira("JIRA-114", "Redis cache cleanup", "Harsha", "Medium"),
                new Jira("JIRA-115", "Docker deployment failure", "Lavanya", "High"),
                new Jira("JIRA-116", "Microservice communication error", "Ajay", "High"),
                new Jira("JIRA-117", "Pagination issue in reports", "Swathi", "Low"),
                new Jira("JIRA-118", "JWT token validation bug", "Teja", "High"),
                new Jira("JIRA-119", "Memory leak investigation", "Manoj", "High"),
                new Jira("JIRA-120", "Accessibility improvement", "Keerthi", "Low")
        );
    }

    private static List<JiraEnum> getJirasUnigEnum() {

        return List.of(
                new JiraEnum("JIRA-101", "Login page issue", "Ravi", Priority.HIGH),
                new JiraEnum("JIRA-102", "Payment gateway failure", "Anjali", Priority.HIGH),
                new JiraEnum("JIRA-103", "UI alignment problem", "Kiran", Priority.LOW),
                new JiraEnum("JIRA-104", "Database connection timeout", "Sneha", Priority.HIGH),
                new JiraEnum("JIRA-105", "Profile update bug", "Rahul", Priority.MEDIUM),
                new JiraEnum("JIRA-106", "Search API optimization", "Meena", Priority.MEDIUM),
                new JiraEnum("JIRA-107", "Email notification issue", "Vikas", Priority.HIGH),
                new JiraEnum("JIRA-108", "Broken image in dashboard", "Pooja", Priority.LOW)
        );
    }
}

record Jira(String jiraId, String description,String assignee, String priority){

}
record JiraEnum(String jiraId, String description,String assignee, Priority priority){

}
enum Priority {
    HIGH,
    MEDIUM,
    LOW
}

