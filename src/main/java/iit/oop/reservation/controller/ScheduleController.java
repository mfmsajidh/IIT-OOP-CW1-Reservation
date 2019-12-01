package iit.oop.reservation.controller;

import iit.oop.reservation.model.Schedule;
import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @GetMapping(value = "/viewAvailableVehicles")
    public Flux<Vehicle> getAllVehicles() {
//        return scheduleService.getAllVehicles();
        return null;
    }

    @PostMapping("/schedule")
    public Mono<Schedule> createSchedule(@Valid @RequestBody Schedule schedule) {
        return scheduleService.createSchedule(schedule);
    }

}
