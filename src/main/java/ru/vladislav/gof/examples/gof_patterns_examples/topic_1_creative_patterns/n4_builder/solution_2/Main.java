package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.solution_2;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.Car;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.CarType;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Transmission;

/**
 * @author Vladislav
 */
public class Main {

    public static void main(String[] args) {
        //Просто пример билдера, как его обычно создают кодогенераторы
        System.out.println(new CarCreator().createCar());
    }

    //Условный класс - Директор
    static class CarCreator {
        public Car createCar() {
            return Car.CarBuilder.newBuilder()
                    .setCarType(CarType.CITY_CAR)
                    .setTransmission(Transmission.MANUAL)
                    .setSeats(5)
                    .setFuel(100000)
                    .setEngine(new Engine(2.5, 100000))
                    .setGpsNavigator(new GPSNavigator())
                    .build();
        }
    }
}
