package tn.esb.lmad.flighPlannerAPI.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esb.lmad.flighPlannerAPI.Domains.Aircraft;
import tn.esb.lmad.flighPlannerAPI.Domains.Passenger;
import tn.esb.lmad.flighPlannerAPI.Repositories.PassengerRepository;

@Service
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public String addPassenger(Passenger passenger) {
        // Check if a passenger with the same passport number already exists
        Passenger existingPassenger = passengerRepository.findByPassportNumber(passenger.getPassportNumber());
        if (existingPassenger != null) {
            return "A user with the same passport number already exists";
        }

        // Persist the new passenger if no existing passenger with the same passport number is found
        passengerRepository.save(passenger);
        return "user added successfully";
    }

    public Passenger updatePassenger(String passportNbre, String fieldName, String fieldValue) {
        Passenger existingPassenger = passengerRepository.findByPassportNumber(passportNbre);
        if (existingPassenger == null) {
            throw new RuntimeException("User with passport number " + passportNbre + " not found");
        }

        switch (fieldName.toLowerCase()) {
            case "name":
                existingPassenger.setName(fieldValue);
                break;
            case "familyname":
                existingPassenger.setFamilyName(fieldValue);
                break;
            case "email":
                existingPassenger.setEmail(fieldValue);
                break;
            case "phonenumber":
                existingPassenger.setPhoneNumber(fieldValue);
                break;
            case "nationality":
                existingPassenger.setNationality(fieldValue);
                break;
            case "passportnumber":
                existingPassenger.setPassportNumber(fieldValue);
                break;
            default:
                throw new IllegalArgumentException("Invalid field name: " + fieldName);
        }

        return passengerRepository.save(existingPassenger);
    }




}
