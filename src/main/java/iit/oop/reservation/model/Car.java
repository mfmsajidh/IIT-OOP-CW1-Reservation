package iit.oop.reservation.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Document("vehicle")
@TypeAlias("Car")
@Data
class Car extends Vehicle {

    private String numberOfDoors;
    private String airConditioning;
}
