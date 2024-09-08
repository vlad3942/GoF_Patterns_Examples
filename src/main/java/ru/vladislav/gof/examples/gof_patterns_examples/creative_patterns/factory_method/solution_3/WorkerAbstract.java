package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.factory_method.solution_3;

/**
 * Класс реализующий какую-либо бизнес логику.
 * Этот класс может быть интерфейсом или абстрактным классом.
 */
public interface WorkerAbstract {

    void doSomething();

    /**
     * Этот метод имеет другую очевидную проблему - это циклическая зависимость.
     * Класс WorkerAbstract использует класс WorkerA, класс WorkerA имплементирует WorkerAbstract. - цикл 1
     * Класс WorkerAbstract использует класс WorkerB, класс WorkerB имплементирует WorkerAbstract. - цикл 2
     * @param condition
     * @return
     */
    static WorkerAbstract getInstance(boolean condition) {
        if (condition) {
            return new WorkerA();
        } else {
            return new WorkerB();
        }
    }

}
