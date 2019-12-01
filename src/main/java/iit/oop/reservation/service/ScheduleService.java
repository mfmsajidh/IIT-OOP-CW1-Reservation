package iit.oop.reservation.service;

import iit.oop.reservation.model.Schedule;
import iit.oop.reservation.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public Mono<Schedule> createSchedule(Schedule schedule) {
        return scheduleRepository.insert(schedule);
    }

}
