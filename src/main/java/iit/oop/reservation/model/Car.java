package iit.oop.reservation.model;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("vehicle")
@TypeAlias("Car")
@Data
class Car extends Vehicle {

    private String numberOfDoors;
    private String airConditioning;
}
