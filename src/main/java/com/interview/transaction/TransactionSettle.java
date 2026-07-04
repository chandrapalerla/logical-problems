package com.interview.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionSettle {
    static void main() {
        Map<String, Integer> contribution = new HashMap<>();
        contribution.put("A", 500);
        contribution.put("B", 300);
        contribution.put("C", 200);
        contribution.put("D", 0);

        List<Transaction> transactions = settleTransactions(contribution);
        transactions.forEach(t ->
                System.out.println(t.from() + " pays " +
                        t.to() + " " +
                        t.amount()));
    }

    private static List<Transaction> settleTransactions(Map<String, Integer> contribution) {

        int total = contribution.values().stream().mapToInt(Integer::intValue).sum();

        int average = total / contribution.size();

        List<PersonBalance> creditors = new ArrayList<>();
        List<PersonBalance> debtors = new ArrayList<>();

        contribution.forEach((person, paid) -> {
            int balance = paid - average;

            if (balance > 0) {
                creditors.add(new PersonBalance(person, balance));
            } else if (balance < 0) {
                debtors.add(new PersonBalance(person, -balance));
            }
        });

        List<Transaction> transactions = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < debtors.size() && j < creditors.size()) {

            PersonBalance debtor = debtors.get(i);
            PersonBalance creditor = creditors.get(j);

            int amount = Math.min(debtor.amount, creditor.amount);

            transactions.add(new Transaction(debtor.name, creditor.name, amount));

            debtor.amount -= amount;
            creditor.amount -= amount;

            if (debtor.amount == 0) {
                i++;
            }

            if (creditor.amount == 0) {
                j++;
            }
        }

        return transactions;
    }

    static class PersonBalance {
        String name;
        int amount;

        PersonBalance(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }
}
