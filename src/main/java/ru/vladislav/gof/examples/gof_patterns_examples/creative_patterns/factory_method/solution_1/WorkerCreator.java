package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.Worker;

public interface WorkerCreator {

    Worker createWorker();
}
