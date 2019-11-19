package iit.oop.reservation.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Car")
class Car extends Vehicle {

    private String numberOfDoors;
    private String airConditioning;

}
