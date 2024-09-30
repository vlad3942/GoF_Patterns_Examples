package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.adapters;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.external_services.StripePaymentService;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.PaymentProcessor;

/**
 * @author Vladislav
 */
public class StripePaymentServiceAdapter implements PaymentProcessor {

    private final StripePaymentService service;
    private final String currency;

    public StripePaymentServiceAdapter(String username, String password, String currency) {
        this.service = new StripePaymentService(new StripePaymentService.StripeConfig(username, password));
        this.currency = currency;
    }


    @Override
    public void processPayment(double amount) {
        service.charge(amount, currency);
    }
}
