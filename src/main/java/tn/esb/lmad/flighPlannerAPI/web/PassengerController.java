package tn.esb.lmad.flighPlannerAPI.web;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esb.lmad.flighPlannerAPI.Domains.Aircraft;
import tn.esb.lmad.flighPlannerAPI.Domains.Passenger;
import tn.esb.lmad.flighPlannerAPI.Services.PassengerService;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost:49430"})
@RestController

@RequestMapping("/passenger")
public class PassengerController {
    public final PassengerService passengerService;
    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("/add")

    public Passenger addUser(@Valid @RequestBody Passenger passenger) {
        return PassengerService.addPassenger(passenger);
    }


}
