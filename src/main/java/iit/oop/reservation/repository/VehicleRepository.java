package iit.oop.reservation.repository;

import iit.oop.reservation.model.Vehicle;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface VehicleRepository extends ReactiveMongoRepository<Vehicle, String> {

    Flux<Vehicle> findAllByType(String type);

}
