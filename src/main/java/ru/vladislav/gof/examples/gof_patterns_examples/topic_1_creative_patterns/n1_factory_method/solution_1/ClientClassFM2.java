package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n1_factory_method.problem.Worker;

/**
 * @author Vladislav
 */
public class ClientClassFM2 {

    private final WorkerCreator creator;

    /**
     * Передача конкретной реализации WorkerCreator в конструкторе через интерфейс выглядит как решение, но это решение
     * предполагает что ответственность по созданию конкретного WorkerCreator ложится на класс,
     * который будет создавать этот клиентский класс.
     * Это в свою очередь вынуждает пользователей этого класса зависеть от конкретной реализации WorkerCreator...
     * @param creator
     */
    public ClientClassFM2(WorkerCreator creator) {
        this.creator = creator;
    }

    /**
     * Вроде бы проблема решена, но не понятно кто создаёт класс WorkerCreator?
     */
    public void doLogicUsingAnyWorker() {
        Worker worker = creator.createWorker();
        worker.doSomething();
    }

    /**
     * По идее решение выгляди так.
     * Как мы видим проблема осталась той же.
     * Только теперь клиентский класс зависит от двух конкретных реализаций WorkerCreator.
     */
    public void doLogicUsingAnyWorker2(boolean flag) {
        WorkerCreator creator1;
        if (flag) {
            creator1 = new WorkerCreatorA(); //Явная зависимость на WorkerCreatorA
        } else {
            creator1 = new WorkerCreatorB(); //Явная зависимость на WorkerCreatorB
        }
        Worker worker = creator1.createWorker();
        worker.doSomething();
    }
}
