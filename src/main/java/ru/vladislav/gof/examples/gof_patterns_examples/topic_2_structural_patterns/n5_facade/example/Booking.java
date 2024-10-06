package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

// Модель данных для бронирования
// Внутреннее представление бронирование, используемое конкретными сервисами
public class Booking {
    String id;
    String details;

    public Booking(String id, String details) {
        this.id = id;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Booking{id='" + id + "', details='" + details + "'}";
    }
}
