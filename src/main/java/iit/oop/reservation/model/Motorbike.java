package iit.oop.reservation.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Document("vehicle")
@TypeAlias("Motorbike")
@Data
class Motorbike extends Vehicle {

    private String helmetProvided;
    private String bikeType;
}
