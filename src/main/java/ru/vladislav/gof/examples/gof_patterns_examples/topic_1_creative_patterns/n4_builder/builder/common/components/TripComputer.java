package ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.components;


import ru.vladislav.gof.examples.gof_patterns_examples.topic_1_creative_patterns.n4_builder.builder.common.cars.Car;

/**
 * Одна из фишек автомобиля.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }

    @Override
    public String toString() {
        return "TripComputer{" + car.getCarType() + '}';
    }
}
