package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

/**
 * @author Vladislav
 */
public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", с молоком";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 20;
    }
}
