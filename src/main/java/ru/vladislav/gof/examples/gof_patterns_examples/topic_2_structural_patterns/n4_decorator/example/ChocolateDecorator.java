package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

/**
 * @author Vladislav
 */
public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", с шоколадным топингом";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 15;
    }
}
