package iit.oop.reservation.repository;

import iit.oop.reservation.model.Schedule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, String> {
}
