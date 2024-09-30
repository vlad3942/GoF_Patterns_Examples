package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n3_prototype.problem_and_solution;

/**
 * @author Vladislav
 */
public class SomeClass implements Cloneable {

    private int a;
    private int b;

    public SomeClass() {
        try {
            //Долгая инициализация
            Thread.sleep(5 * 1000);
            a = 1;
            b = 10;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
