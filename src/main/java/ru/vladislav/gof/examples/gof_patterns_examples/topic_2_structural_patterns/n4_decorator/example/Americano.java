package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

/**
 * @author Vladislav
 */
public class Americano implements Beverage {

    @Override
    public String getDescription() {
        return "Это Американо";
    }

    @Override
    public double getCost() {
        return 150;
    }
}
