package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.framework_solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerA;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.WorkerB;

/**
 * @author Vladislav
 */
@Configuration
public class AppConfig {

    @Bean(name = "worker_a")
    public Worker createWorkerA() {
        return new WorkerA();
    }

    @Bean(name = "worker_b")
    public Worker createWorkerB() {
        return new WorkerB();
    }
}
