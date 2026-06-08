package com.interview.streamapi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateDiscountRate {
    static void main(){
        var txns = List.of(
                new Transaction("C1", 200.0, "APPROVED",  "PLATINUM"),
                new Transaction("C2", 100.0, "APPROVED",  "GOLD"),
                new Transaction("C3",  50.0, "DECLINED",  "GOLD"),
                new Transaction("C4", 300.0, "APPROVED",  "STANDARD"),
                new Transaction("C5", 400.0, "APPROVED",  "PLATINUM"),
                new Transaction("C6",  80.0, "APPROVED",  "GOLD")
        );
        var result = new CalculateDiscountRate().discountByTier(txns);
        result.forEach((tier, total) ->
                System.out.printf("%-10s → £%.2f%n", tier, total));
    }
    public Map<String, Double> discountByTier(List<Transaction> transactions) {

        return transactions.stream().filter(tx -> tx.status.equals("APPROVED"))
                .collect(Collectors.groupingBy(Transaction::tier, Collectors.summingDouble(Transaction::amount)))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> calculateFinalPrice(e.getKey(), e.getValue())
                ));

    }
    private static double discountRate(String tier) {
        return switch (tier) {
            case "GOLD"     -> 0.10;
            case "PLATINUM" -> 0.15;
            default         -> 0.05;
        };
    }
    private static double calculateFinalPrice(String tier, Double value){
        return value - value * discountRate(tier);
    }
    record Transaction(
            String customerId,
            double amount,
            String status,   // "APPROVED" or "DECLINED"
            String tier      // "STANDARD", "GOLD", "PLATINUM"
    ) {}
}
