package tn.esb.lmad.flighPlannerAPI.web;

import org.springframework.web.bind.annotation.*;
import tn.esb.lmad.flighPlannerAPI.Domains.Flight;
import tn.esb.lmad.flighPlannerAPI.Services.FlightsService;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:8080","http://localhost:5432"})

@RestController

@RequestMapping("/flight")
public class FlightController {
    private final FlightsService flightService;

    public FlightController(FlightsService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/getFlight")
    public List<Flight> getFlightByDepartureDateTime( LocalDateTime departureDateTime) {
        return flightService.getFlightByDepartureDateTime(departureDateTime);
    }
}
