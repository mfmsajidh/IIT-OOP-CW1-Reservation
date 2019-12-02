package iit.oop.reservation.repository;

import iit.oop.reservation.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {

    List<Vehicle> findAllByType(String type);

    @Query("{ $and: [{ '_id': { $nin: ?0}}, { 'type': ?1}]}")
    List<Vehicle> findAllVehiclesNotInId(ArrayList<String> idList, String vehicleType);

}
