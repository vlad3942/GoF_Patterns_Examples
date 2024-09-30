package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.solution_1.builders;


import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.CarType;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Transmission;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
