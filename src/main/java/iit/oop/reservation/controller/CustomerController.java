package iit.oop.reservation.controller;

import iit.oop.reservation.model.Customer;
import iit.oop.reservation.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Mono<Customer> createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
}
