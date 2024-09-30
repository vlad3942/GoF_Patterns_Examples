package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.DefaultPaymentProcessor;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.PaymentProcessor;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.adapters.PayPalPaymentServiceAdapter;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.processors.adapters.StripePaymentServiceAdapter;

/**
 * @author Vladislav
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("first call");
        doTxn(new DefaultPaymentProcessor());
        System.out.println("second call");
        doTxn(new PayPalPaymentServiceAdapter());
        System.out.println("third call");
        doTxn(new StripePaymentServiceAdapter("test", "test", "USD"));
    }

    private static void doTxn(PaymentProcessor paymentProcessor) {
        paymentProcessor.processPayment(100.10);
    }
}
