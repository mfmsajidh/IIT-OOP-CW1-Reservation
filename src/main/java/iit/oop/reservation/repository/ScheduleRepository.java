package iit.oop.reservation.repository;

import iit.oop.reservation.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface ScheduleRepository extends MongoRepository<Schedule, String> {

    @Query("{ $or: [{'pickUpDate': { $gte: ?0, $lte: ?1 }}, {'dropOffDate': { $gte: ?0, $lte: ?1 }}]}")
    ArrayList<Schedule> findSchedulesByPickUpDateOrDropOffDateBetween(LocalDate fromDate, LocalDate toDate);

}
