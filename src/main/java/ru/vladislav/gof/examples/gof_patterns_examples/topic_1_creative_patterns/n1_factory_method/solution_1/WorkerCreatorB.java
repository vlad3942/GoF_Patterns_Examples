package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.problem.WorkerB;

/**
 * @author Vladislav
 */
public class WorkerCreatorB implements WorkerCreator {
    @Override
    public Worker createWorker() {
        return new WorkerB();
    }
}
