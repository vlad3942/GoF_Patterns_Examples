package ru.vladislav.gof.examples.gof_patterns_examples.topic_2_structural_patterns.n5_facade.example;

import java.util.Date;

public class TravelFacadeImpl implements TravelFacade {

    private static volatile TravelFacade INSTANCE;

    private final FlightBookingService flightBookingService;
    private final HotelBookingService hotelBookingService;
    private final CarRentalService carRentalService;

    public TravelFacadeImpl(FlightBookingService flightBookingService, HotelBookingService hotelBookingService, CarRentalService carRentalService) {
        this.flightBookingService = flightBookingService;
        this.hotelBookingService = hotelBookingService;
        this.carRentalService = carRentalService;
    }

    //Применение синглтона для создания фасада
    public static TravelFacade getInstance() {
        if (INSTANCE == null) {
            synchronized (TravelFacadeImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TravelFacadeImpl(
                            new FlightBookingService(),
                            new HotelBookingService(),
                            new CarRentalService()
                    );
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public TravelBookingDTO bookTrip(String destination, Date startDate, Date endDate) {
        var flightBookingId = flightBookingService.bookFlight(destination, startDate);
        var hotelBookingId = hotelBookingService.bookHotel(destination, startDate, endDate);
        var carBookingId = carRentalService.bookCar(destination, startDate, endDate);
        return new TravelBookingDTO(flightBookingId, hotelBookingId, carBookingId);
    }

    @Override
    public String cancelTrip(TravelBookingDTO trip) {
        flightBookingService.cancelFlight(trip.getFlightBookingId());
        hotelBookingService.cancelHotel(trip.getHotelBookingId());
        carRentalService.cancelCar(trip.getCarBookingId());
        return "Бронирование во всех заведениях успешно отменено.";
    }


}
