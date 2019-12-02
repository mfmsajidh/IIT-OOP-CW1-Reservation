package iit.oop.reservation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {

    @Id
    private String _id;

    private String name;
    private String nicNumber;
    private int phoneNumber;
    private String email;

}
