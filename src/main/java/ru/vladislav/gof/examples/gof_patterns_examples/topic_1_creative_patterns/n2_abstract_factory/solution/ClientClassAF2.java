package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.solution;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.problem.*;

/**
 * Проблема решается путём вынесения кода создания компонентов в конкретный factory класс, реализующий интерфейс абстрактной фабрики - ComponentsFactory.
 * Способ выбора конкретной реализации и инициализации ComponentsFactory не регламентируется.
 * Можно передавать через интерфейс в конструкторе. Можно прямо в классе по условию.
 * А вообще о том как это сделать смотри factory method =)
 * @author Vladislav
 */
public class ClientClassAF2 {

    ComponentsFactory componentsFactory;

    Component1 component1;
    Component2 component2;
    Component3 component3;

    private ClientClassAF2(ComponentsFactory componentsFactory) {
        this.componentsFactory = componentsFactory;
    }

    public void doLogicC1() {
        component1 = componentsFactory.createComponent1();
        //Что-то делаем с компонентами...
    }

    public void doLogicC2() {
        component2 = componentsFactory.createComponent2();
        //Что-то делаем с компонентами...
    }

    public void doLogicC3() {
        component3 = componentsFactory.createComponent3();
        //Что-то делаем с компонентами...
    }
}
