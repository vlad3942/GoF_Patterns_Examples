package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.external_services;

/**
 * @author Vladislav
 */
public class PayPalPaymentService {

    public int makePayment(String amountInDollars) {
        var amount = Double.parseDouble(amountInDollars);
        System.out.println("PayPal transaction completed successfully!");
        System.out.println("Transaction amount is " + amount);
        return (int) amount;
    }
}
