package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.util.*;

// Сервис бронирования авиа перелетов
public class FlightBookingService {

    private Map<String, Booking> bookings = new HashMap<>();

    public List<String> searchFlights(String destination, Date date) {
        // Пример поиска рейсов
        return Arrays.asList("Flight to " + destination + " on " + date);
    }

    public String bookFlight(String destination, Date date) {
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, "Flight to " + destination + " on " + date);
        bookings.put(bookingId, booking);
        System.out.println("Flight booked: " + booking);
        return bookingId;
    }

    public void cancelFlight(String bookingId) {
        Booking removed = bookings.remove(bookingId);
        if (removed != null) {
            System.out.println("Flight booking cancelled: " + removed);
        } else {
            System.out.println("No flight booking found with ID: " + bookingId);
        }
    }
}
