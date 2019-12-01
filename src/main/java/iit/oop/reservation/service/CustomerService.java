package iit.oop.reservation.service;

import iit.oop.reservation.model.Customer;
import iit.oop.reservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Mono<Customer> createCustomer(Customer customer) {
        return customerRepository.insert(customer);
    }

}
