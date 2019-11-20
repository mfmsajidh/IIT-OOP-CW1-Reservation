package iit.oop.reservation.model;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("vehicle")
@TypeAlias("Motorbike")
@Data
class Motorbike extends Vehicle {

    private String helmetProvided;
    private String bikeType;
}
