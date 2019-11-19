package iit.oop.reservation.repository;

import iit.oop.reservation.model.Vehicle;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends ReactiveMongoRepository<Vehicle, String> {
}
