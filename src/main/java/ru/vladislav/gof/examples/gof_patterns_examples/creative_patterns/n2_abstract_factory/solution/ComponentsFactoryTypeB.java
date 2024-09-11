package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n2_abstract_factory.solution;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n2_abstract_factory.problem.*;

/**
 * @author Vladislav
 */
public class ComponentsFactoryTypeB implements ComponentsFactory {
    @Override
    public Component1 createComponent1() {
        return new Component1TypeB();
    }

    @Override
    public Component2 createComponent2() {
        return new Component2TypeB();
    }

    @Override
    public Component3 createComponent3() {
        return new Component3TypeB();
    }
}
