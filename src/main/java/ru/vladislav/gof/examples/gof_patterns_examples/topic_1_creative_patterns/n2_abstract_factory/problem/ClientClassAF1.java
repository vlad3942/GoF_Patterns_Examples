package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.problem;

/**
 * Проблема: классу ClientClassAF1 нужны все компоненты одного типа.
 * Код инициализации компонентов размазан по всему классу.
 * Используется один и тот же признак для выбора реализации.
 * Явная зависимость на все имплементации компонентов
 * @author Vladislav
 */
public class ClientClassAF1 {

    Component1 component1;
    Component2 component2;
    Component3 component3;

    public void doLogicC1(String type) {
        if (type.equals("A")) {
            component1 = new Component1TypeA();
        } else {
            component1 = new Component1TypeB();
        }
        //Что-то делаем с компонентами...
    }

    public void doLogicC2(String type) {
        if (type.equals("A")) {
            component2 = new Component2TypeA();
        } else {
            component2 = new Component2TypeB();
        }
        //Что-то делаем с компонентами...
    }

    public void doLogicC3(String type) {
        if (type.equals("A")) {
            component3 = new Component3TypeA();
        } else {
            component3 = new Component3TypeB();
        }
        //Что-то делаем с компонентами...
    }
}
