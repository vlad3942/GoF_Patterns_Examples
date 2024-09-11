package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.framework_solution;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.problem.Worker;

/**
 * @author Vladislav
 */
@Component
public class ClientClassFMFW {

    private final Worker worker;

    @Autowired
    public ClientClassFMFW(@Qualifier("worker_b") Worker worker) {
        this.worker = worker;
    }

    public void doLogicUsingAnyWorker() {
        this.worker.doSomething();
    }

    @PostConstruct
    public void pc() {
        this.doLogicUsingAnyWorker();
    }
}
