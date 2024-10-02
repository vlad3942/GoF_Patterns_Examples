package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n4_decorator.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * @author Vladislav
 */
public class CoffeeShop {

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Заказ Эспрессо с молоком и сахаром
        Beverage espresso = new Espresso();
        espresso = new MilkDecorator(espresso);
        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.getDescription() + " - цена ₽" + espresso.getCost());

        // Заказ Американо с шоколадом и молоком
        Beverage americano = new Americano();
        americano = new ChocolateDecorator(americano);
        americano = new MilkDecorator(americano);
        System.out.println(americano.getDescription() + " - цена ₽" + americano.getCost());
    }
}
