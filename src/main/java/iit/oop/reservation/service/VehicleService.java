package iit.oop.reservation.service;

import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public List<Vehicle> getVehiclesByType(String type) {
        return vehicleRepository.findAllByType(type);
    }
}
