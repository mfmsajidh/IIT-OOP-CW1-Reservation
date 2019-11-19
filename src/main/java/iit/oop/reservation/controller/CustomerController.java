package iit.oop.reservation.controller;

import iit.oop.reservation.model.Customer;
import iit.oop.reservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/vehicles")
    public Flux<Customer> getAllVehicles() {
        return customerRepository.findAll();
    }

}
