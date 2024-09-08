package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem;

/**
 * Конкретная реализация бизнес логики из интерфейса Worker
 * @author Vladislav
 */
public class WorkerB implements Worker {
    @Override
    public void doSomething() {
        System.out.println("Worker B");
    }
}
