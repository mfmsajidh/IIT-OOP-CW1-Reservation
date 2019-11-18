package iit.oop.reservation.repository;

import iit.oop.reservation.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String > {
}
