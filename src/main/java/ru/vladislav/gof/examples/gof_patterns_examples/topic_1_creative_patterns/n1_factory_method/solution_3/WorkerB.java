package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.solution_3;

/**
 * Конкретная реализация бизнес логики из интерфейса Worker
 * @author Vladislav
 */
public class WorkerB implements WorkerAbstract {
    @Override
    public void doSomething() {
        System.out.println("Worker B");
    }
}
