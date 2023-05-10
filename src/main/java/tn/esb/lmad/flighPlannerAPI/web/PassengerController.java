package tn.esb.lmad.flighPlannerAPI.web;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esb.lmad.flighPlannerAPI.Domains.Passenger;
import tn.esb.lmad.flighPlannerAPI.Services.PassengerService;

@CrossOrigin(origins = {"http://localhost:3000","http://localhost:5432"})
@RestController

@RequestMapping("/passenger")
public class PassengerController {
    public final PassengerService passengerService;
    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("/add")

    public Passenger addPassenger(@Valid @RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }


//    @PutMapping("/update/{code}")
//    public Aircraft updateOneAircraft(@PathVariable String code,@Valid @RequestBody Aircraft aircraft){
//        return aircraftService.updateAircraft(code,aircraft);
//    }

    @PutMapping("/update/{passportNumber}/{fieldName}")
    public Passenger updateOnePassenger( @PathVariable String passportNumber,@PathVariable  String fieldName,@RequestBody  String fieldValue){
        return passengerService.updatePassenger(passportNumber,fieldName,fieldValue);
    }

}
