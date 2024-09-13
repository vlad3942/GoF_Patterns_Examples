package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.director;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.cars.CarType;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.Transmission;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.TripComputer;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.builders.Builder;


/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCustom(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(4);
        builder.setEngine(new Engine(3.5, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator("Custom route"));
    }
}
