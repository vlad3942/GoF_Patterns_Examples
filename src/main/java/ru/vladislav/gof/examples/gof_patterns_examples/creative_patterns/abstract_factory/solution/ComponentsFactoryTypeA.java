package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.abstract_factory.solution;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.abstract_factory.problem.*;

/**
 * @author Vladislav
 */
public class ComponentsFactoryTypeA implements ComponentsFactory {
    @Override
    public Component1 createComponent1() {
        return new Component1TypeA();
    }

    @Override
    public Component2 createComponent2() {
        return new Component2TypeA();
    }

    @Override
    public Component3 createComponent3() {
        return new Component3TypeA();
    }
}
