package iit.oop.reservation.controller;

import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{type}")
    public List<Vehicle> getVehiclesByType(@PathVariable("type") String type) {
        return vehicleService.getVehiclesByType(type);
    }


}
