package tn.esb.lmad.flighPlannerAPI.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
//this class is the boundary of our architecture ECB (Entity Control Boundary)
//In the controller we will have the endpoints (APIs) that will be exposed to the outside world
//the controller interacts with the service layer and with the front end
//the controller is listening to the requests from the front end and it will call the service layer
//the controller will return the response to the front end
//the frontend/backend communication is done using json (or xml, resources, etc...) and HTTP protocol
//so in the controller we use annotations like @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
//and we use the @RequestBody annotation to get the json from the request body
// for the data format we use annotations like @JsonFormat, @JsonIdentityInfo, @JsonIgnore, @JsonProperty
public class AircraftController {
}
