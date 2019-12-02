package iit.oop.reservation.service;

import iit.oop.reservation.model.Schedule;
import iit.oop.reservation.model.Vehicle;
import iit.oop.reservation.repository.ScheduleRepository;
import iit.oop.reservation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    VehicleRepository vehicleRepository;
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> searchVehicles(LocalDate fromDate, LocalDate toDate, String vehicleType) {
        List<Schedule> schedules = scheduleRepository.findSchedulesByPickUpDateOrDropOffDateBetween(fromDate, toDate);
        return schedules;
    }

    public Schedule scheduleVehicle(Schedule schedule) {
        return scheduleRepository.insert(schedule);
    }

}
