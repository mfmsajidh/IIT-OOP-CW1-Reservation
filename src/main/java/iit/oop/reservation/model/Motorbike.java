package iit.oop.reservation.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

@Data
@JsonTypeName("Motorbike")
public class Motorbike extends Vehicle {

    private String helmetProvided;
    private String bikeType;
}
