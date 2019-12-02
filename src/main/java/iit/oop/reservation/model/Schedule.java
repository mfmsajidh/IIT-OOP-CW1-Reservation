package iit.oop.reservation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
public class Schedule {

    @Id
    private String _id;

    private LocalDate pickUpDate;
    private LocalDate dropOffDate;
    private String customer_id;
    private String vehicle_id;
}
