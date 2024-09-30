package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.problem;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.Car;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.CarType;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.Manual;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Transmission;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.TripComputer;

/**
 * @author Vladislav
 */
public class Main {

    //Пример создания классов вручную
    public static void main(String[] args) {
        //Создание автомобиля в клиентском коде:
        var computer = new TripComputer();
        var gps = new GPSNavigator("Custom route");
        Car car = new Car(
                CarType.SPORTS_CAR,
                4,
                new Engine(3.5, 0),
                Transmission.AUTOMATIC,
                computer,
                gps
        );
        computer.setCar(car);
        System.out.println(car);

        //"Ручное" создание мануала в клиентском коде:
        Manual manual = new Manual(
                CarType.SPORTS_CAR,
                4,
                new Engine(3.5, 0),
                Transmission.AUTOMATIC,
                computer,
                gps
        );
        System.out.println(manual.print());
    }
}
