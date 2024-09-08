package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_2;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerA;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerB;

/**
 * Утилитный класс для создания объектов...
 * Нарушает Low Coupling и Height Cohesion
 * @author Vladislav
 */
public class SpecificWorkerCreator {

    public static Worker createWorker(boolean condition) {
        if (condition) {
            return new WorkerA();
        } else {
            return new WorkerB();
        }
    }
}
