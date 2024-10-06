package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.util.Date;

public interface TravelFacade {
    TravelBookingDTO bookTrip(String destination, Date startDate, Date endDate);
    String cancelTrip(TravelBookingDTO trip);
}
