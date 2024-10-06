package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.util.*;

// Сервис бронирования гостиниц
public class HotelBookingService {
    private Map<String, Booking> bookings = new HashMap<>();

    public List<String> searchHotels(String destination, Date startDate, Date endDate) {
        // Пример поиска отелей
        return Arrays.asList("Hotel in " + destination + " from " + startDate + " to " + endDate);
    }

    public String bookHotel(String destination, Date startDate, Date endDate) {
        String bookingId = UUID.randomUUID().toString();
        Booking booking = new Booking(bookingId, "Hotel in " + destination + " from " + startDate + " to " + endDate);
        bookings.put(bookingId, booking);
        System.out.println("Hotel booked: " + booking);
        return bookingId;
    }

    public void cancelHotel(String bookingId) {
        Booking removed = bookings.remove(bookingId);
        if (removed != null) {
            System.out.println("Hotel booking cancelled: " + removed);
        } else {
            System.out.println("No hotel booking found with ID: " + bookingId);
        }
    }
}
