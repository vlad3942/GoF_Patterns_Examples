package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.problem.WorkerA;

/**
 * @author Vladislav
 */
public class WorkerCreatorA implements WorkerCreator {
    @Override
    public Worker createWorker() {
        return new WorkerA();
    }
}
