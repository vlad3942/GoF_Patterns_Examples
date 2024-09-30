package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.solution;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.problem.Component1;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.problem.Component2;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n2_abstract_factory.problem.Component3;

public interface ComponentsFactory {

    Component1 createComponent1();
    Component2 createComponent2();
    Component3 createComponent3();
}
