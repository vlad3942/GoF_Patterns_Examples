package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

/**
 * @author Vladislav
 */
public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
