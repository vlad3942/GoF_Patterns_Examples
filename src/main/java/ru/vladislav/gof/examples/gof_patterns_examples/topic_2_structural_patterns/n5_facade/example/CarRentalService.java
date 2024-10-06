package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.util.*;

// Сервис бронирования автомобилей
public class CarRentalService {
    private Map<String, Booking> bookings = new HashMap<>();

    public List<String> searchCars(String destination, Date startDate, Date endDate) {
        // Пример поиска автомобилей
        return Arrays.asList("Car rental in " + destination + " from " + startDate + " to " + endDate);
    }

    public String bookCar(String destination, Date startDate, Date endDate) {
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, "Car rental in " + destination + " from " + startDate + " to " + endDate);
        bookings.put(bookingId, booking);
        System.out.println("Car booked: " + booking);
        return bookingId;
    }

    public void cancelCar(String bookingId) {
        Booking removed = bookings.remove(bookingId);
        if (removed != null) {
            System.out.println("Car rental cancelled: " + removed);
        } else {
            System.out.println("No car booking found with ID: " + bookingId);
        }
    }
}
