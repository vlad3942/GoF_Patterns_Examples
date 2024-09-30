package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars;

import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.Transmission;
import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components.TripComputer;

import java.util.Objects;

/**
 * Автомобиль — это класс продукта.
 */
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }

    public static class CarBuilder {
        private CarType carType;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;
        private double fuel;

        private CarBuilder() {}

        public static CarBuilder newBuilder() {
            return new CarBuilder();
        }
        public CarBuilder setCarType(CarType carType) {
            this.carType = carType;
            return this;
        }
        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }
        public CarBuilder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }
        public CarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }
        public CarBuilder setFuel(double fuel) {
            this.fuel = fuel;
            return this;
        }
        public Car build() {
            var result = new Car(
                    carType,
                    seats,
                    engine,
                    transmission,
                    tripComputer,
                    gpsNavigator
            );
            if (Objects.nonNull(tripComputer)) {
                tripComputer.setCar(result);
            }
            result.setFuel(fuel);
            return result;
        }
    }
}
