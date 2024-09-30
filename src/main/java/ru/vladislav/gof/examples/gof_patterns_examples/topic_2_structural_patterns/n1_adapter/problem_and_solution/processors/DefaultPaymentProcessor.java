package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors;

/**
 * @author Vladislav
 */
public class DefaultPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Txn completed successfully!");
        System.out.println("Txn amount is " + amount);
    }
}
