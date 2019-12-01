package iit.oop.reservation.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document
public class Customer {

    @Id
    private @Setter ObjectId _id;

    private @Getter @Setter String name;
    private @Getter @Setter String nicNumber;
    private @Getter @Setter int phoneNumber;
    private @Getter @Setter String email;

    public String get_id() {
        return _id.toHexString();
    }
}
