package iit.oop.reservation.service;

import iit.oop.reservation.model.Customer;
import iit.oop.reservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.insert(customer);
    }

}
