package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.builders;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.cars.CarType;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.cars.Manual;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.Engine;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.GPSNavigator;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.Transmission;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.components.TripComputer;

/**
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим руководство пользователя автомобиля с помощью
 * тех же шагов, что и сами автомобили. Это устройство позволит создавать
 * руководства под конкретные модели автомобилей, содержащие те или иные фичи.
 */
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
