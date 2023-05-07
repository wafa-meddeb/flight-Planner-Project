package tn.esb.lmad.flighPlannerAPI.Services;

import org.springframework.stereotype.Service;
import tn.esb.lmad.flighPlannerAPI.Domains.Aircraft;
import tn.esb.lmad.flighPlannerAPI.Domains.Flight;
import tn.esb.lmad.flighPlannerAPI.Domains.Passenger;
import tn.esb.lmad.flighPlannerAPI.Repositories.FlightRepository;

import java.time.LocalDateTime;
import java.util.List;
//import java.util.Optional;//optional is a container object used to contain
// not-null objects. Optional object is used to represent null with absent value.
// This class has various utility methods to facilitate code to handle values
// as ‘available’ or ‘not available’ instead of checking null values.

@Service
public class FlightsService {
    public List<Flight> getFlightByDepartureDateTime(LocalDateTime departureDateTime) {
        Flight existingFlight = FlightRepository.findByDepartureDateTime(departureDateTime);
        if (existingFlight == null) {
            throw new RuntimeException("flight with departure date and time " + departureDateTime + " does not exist");
        }
        return List.of(existingFlight);
    }


}
