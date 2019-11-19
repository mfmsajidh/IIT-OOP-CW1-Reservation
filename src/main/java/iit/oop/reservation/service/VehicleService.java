package iit.oop.reservation.service;

import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;


    public Flux<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }
}
