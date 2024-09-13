package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1;

import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.cars.Manual;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.builder.common.cars.Car;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.builders.CarBuilder;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.builders.CarManualBuilder;
import ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n4_builder.solution_1.director.Director;

/**
 * @author Vladislav
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructCustom(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
        System.out.println("-----");
        System.out.println(car);
        System.out.println("-----");


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
