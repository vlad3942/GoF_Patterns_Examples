package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerA;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerB;

/**
 * @author Vladislav
 */
public class WorkerCreatorB implements WorkerCreator {
    @Override
    public Worker createWorker() {
        return new WorkerB();
    }
}
