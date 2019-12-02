package iit.oop.reservation.repository;

import iit.oop.reservation.model.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScheduleRepository extends MongoRepository<Schedule, String> {

    List<Schedule> findByPickUpDateBetweenAndDropOffDateBetween(LocalDate pickUpDateGT, LocalDate pickUpDateLT, LocalDate dropOffDateGT, LocalDate dropOffDateLT);

}
