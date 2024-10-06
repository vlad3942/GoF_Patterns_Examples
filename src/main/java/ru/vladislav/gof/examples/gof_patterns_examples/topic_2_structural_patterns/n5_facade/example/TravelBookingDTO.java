package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

/**
 Класс для передачи результатов бронирования в клиентский код
*/
public class TravelBookingDTO {
    private final String flightBookingId;
    private final String hotelBookingId;
    private final String carBookingId;

    public TravelBookingDTO(String flightBookingId, String hotelBookingId, String carBookingId) {
        this.flightBookingId = flightBookingId;
        this.hotelBookingId = hotelBookingId;
        this.carBookingId = carBookingId;
    }

    public String getFlightBookingId() {
        return flightBookingId;
    }

    public String getHotelBookingId() {
        return hotelBookingId;
    }

    public String getCarBookingId() {
        return carBookingId;
    }

    public String getMessage() {
        return "Ваша путёвка забронирована" + '\n' +
                "Номер вашего авиа билета: " + flightBookingId + '\n' +
                "Номер вашего бронирования в отеле: " + hotelBookingId + '\n' +
                "Номер вашего бронирования для получения автомобиля" + carBookingId + '\n';
    }
}
