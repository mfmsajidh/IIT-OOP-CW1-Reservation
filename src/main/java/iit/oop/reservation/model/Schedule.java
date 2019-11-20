package iit.oop.reservation.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Schedule {

    @Id
    private @Setter ObjectId _id;

    private @Getter @Setter LocalDate pickUpDate;
    private @Getter @Setter LocalDate dropOffDate;
    private @Getter @Setter LocalDate bookedDate;

    public String get_id() {
        return _id.toHexString();
    }
}
