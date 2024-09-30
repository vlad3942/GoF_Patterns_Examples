package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n1_adapter.problem_and_solution.external_services;

/**
 * @author Vladislav
 */
public class StripePaymentService {

    private final StripeConfig config;

    public StripePaymentService(StripeConfig config) {
        this.config = config;
    }

    public void charge(double totalAmount, String currency) {
        if (!config.username.equals("test") || !config.password.equals("test")) {
            throw new IllegalStateException("Invalid username or password");
        }
        System.out.println("Stripe transaction completed successfully!");
        System.out.println("Transaction totalAmount is " + totalAmount + " with currency " + currency);
    }

    public static class StripeConfig {

        private final String username;
        private final String password;

        public StripeConfig(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
