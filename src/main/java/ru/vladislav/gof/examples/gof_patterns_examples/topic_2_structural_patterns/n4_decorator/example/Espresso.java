package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

/**
 * @author Vladislav
 */
public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Это Эспрессо";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
