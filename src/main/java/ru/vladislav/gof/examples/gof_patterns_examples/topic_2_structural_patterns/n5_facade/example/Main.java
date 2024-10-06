package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Данные для бронирования
        String destination = "Paris";
        Date startDate = new Date(); // текущая дата
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Date endDate = calendar.getTime(); // дата через 5 дней

        TravelFacade travelFacade = TravelFacadeImpl.getInstance();

        var tripDTO = travelFacade.bookTrip(destination, startDate, endDate);

        System.out.println(tripDTO.getMessage());

        // Отмена бронирований
        System.out.println(travelFacade.cancelTrip(tripDTO));

    }
}
