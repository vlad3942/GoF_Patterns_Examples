package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_3;

/**
 * Конкретная реализация бизнес логики из интерфейса Worker
 * @author Vladislav
 */
public class WorkerA implements WorkerAbstract {
    @Override
    public void doSomething() {
        System.out.println("Worker A");
    }
}
