package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_2;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.problem.Worker;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_1.WorkerCreator;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_1.WorkerCreatorA;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_1.WorkerCreatorB;

/**
 * @author Vladislav
 */
public class ClientClassFM3 {

    /**
     * Переложили ответственность за создание конкретного экземпляра Worker на класс SpecificWorkerCreator.
     * Это позволяет не размазывать логику создания экземпляров Worker по всему клиентскому коду.
     * Однако мы всё равно зависим от класса SpecificWorkerCreator и его метода createWorker =)
     * А сам класс SpecificWorkerCreator зависит и от WorkerA и от WorkerB.
     * Метод createWorker в SpecificWorkerCreator может быть не статическим. Тогда мы либо создаём экземпляр SpecificWorkerCreator
     * в клиентском коде, либо получаем его из вне в конструкторе в геттере или в качестве параметра.
     * @param flag
     */
    public void doLogicUsingAnyWorker(boolean flag) {
        Worker worker = SpecificWorkerCreator.createWorker(flag);
        worker.doSomething();
    }
}
