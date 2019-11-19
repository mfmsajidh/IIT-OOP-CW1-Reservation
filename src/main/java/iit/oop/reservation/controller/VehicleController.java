package iit.oop.reservation.controller;

import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping(value = "/vehicles")
    public Flux<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }


}
