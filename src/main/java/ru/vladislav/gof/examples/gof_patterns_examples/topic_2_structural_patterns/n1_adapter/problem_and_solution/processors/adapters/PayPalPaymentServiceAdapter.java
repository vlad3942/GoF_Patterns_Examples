package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.adapters;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.external_services.PayPalPaymentService;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.PaymentProcessor;

/**
 * @author Vladislav
 */
public class PayPalPaymentServiceAdapter implements PaymentProcessor {

    private final PayPalPaymentService paymentService = new PayPalPaymentService();

    @Override
    public void processPayment(double amount) {
        paymentService.makePayment(Double.toString(amount)); //make txn, ignore result
    }
}
