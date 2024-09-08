package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_3;

/**
 * @author Vladislav
 */
public class ClientClassFM4 {

    /**
     * Логика создания конкретного класса имплементирующего WorkerAbstract перенесена в статический метод
     * супер-класса WorkerAbstract -> getInstance. Этот метод принимает параметры по которым делает вывод о том какой instance создать.
     * @param flag
     */
    public void doLogicUsingAnyWorker(boolean flag) {
        WorkerAbstract worker = WorkerAbstract.getInstance(flag);
        worker.doSomething();
    }
}
