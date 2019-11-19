package iit.oop.reservation.repository;

import iit.oop.reservation.model.Vehicle;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VehicleRepository extends ReactiveMongoRepository<Vehicle, String> {
}
