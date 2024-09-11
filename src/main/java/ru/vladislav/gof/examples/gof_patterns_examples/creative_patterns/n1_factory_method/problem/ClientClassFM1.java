package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n1_factory_method.problem;

/**
 * Основной клиентский класс (класс 1)
 * @author Vladislav
 */
public class ClientClassFM1 {

    /**
     * Проблема - клиентский класс, который использует объекты типа Worker,
     * сам создаёт конкретный экземпляр класса Worker.
     * Из-за этого клиентский класс зависит не только от интерфейса Worker,
     * но и от всех конкретных реализаций которые он использует.
     * @param flag
     */
    public void doLogicUsingAnyWorker(boolean flag) {
        Worker worker;
        if (flag) {
            worker = new WorkerA(); //Явная зависимость от класса WorkerA
        } else {
            worker = new WorkerB(); //Явная зависимость от класса WorkerB
        }
        worker.doSomething();
    }
}
