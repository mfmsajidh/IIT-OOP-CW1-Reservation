package iit.oop.reservation.controller;

import iit.oop.reservation.model.Schedule;
import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/searchVehicles")
    public List<Schedule> searchVehicles(
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fromDate,
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate toDate,
            @RequestParam String vehicleType
    ) {
        return scheduleService.searchVehicles(fromDate, toDate, vehicleType);
    }

    @PostMapping("/scheduleVehicle")
    public Schedule scheduleVehicle(@Valid @RequestBody Schedule schedule) {
        return scheduleService.scheduleVehicle(schedule);
    }

}
