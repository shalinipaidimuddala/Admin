


import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Transaction {
    private String customerId;
    private String productName;
    private LocalDate transactionDate;
    private double amount;

    public Transaction(String customerId, String productName, LocalDate transactionDate, double amount) {
        this.customerId = customerId;
        this.productName = productName;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

    // Getters and setters
    public String getCustomerId() { return customerId; }
    public String getProductName() { return productName; }
    public LocalDate getTransactionDate() { return transactionDate; }
    public double getAmount() { return amount; }
}

public class TransactionAnalysis {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("C1", "ProductA", LocalDate.now().minusDays(10), 100.0),
                new Transaction("C2", "ProductA", LocalDate.now().minusDays(5), 200.0),
                new Transaction("C1", "ProductB", LocalDate.now().minusDays(15), 300.0),
                new Transaction("C3", "ProductA", LocalDate.now().minusDays(2), 150.0),
                new Transaction("C2", "ProductB", LocalDate.now().minusDays(1), 400.0)
        );

        // Filter transactions within the last 30 days
        LocalDate cutoffDate = LocalDate.now().minusDays(30);
        List<Transaction> recentTransactions = transactions.stream()
                .filter(t -> t.getTransactionDate().isAfter(cutoffDate))
                .collect(Collectors.toList());

        // Group transactions by product and customer
        Map<String, Map<String, Double>> transactionMap = recentTransactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getProductName,
                        Collectors.groupingBy(
                                Transaction::getCustomerId,
                                Collectors.summingDouble(Transaction::getAmount)
                        )
                ));

        // Find top 3 customers for each product
        transactionMap.forEach((productName, customerMap) -> {
            System.out.println("Product: " + productName);
            customerMap.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(3)
                    .forEach(e -> System.out.println("Customer ID: " + e.getKey() + ", Amount: " + e.getValue()));
            System.out.println();
        });
    }
}


