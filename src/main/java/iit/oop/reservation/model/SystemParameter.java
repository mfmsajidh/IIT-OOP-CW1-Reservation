package iit.oop.reservation.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class SystemParameter {

    @Id
    private String _id;
    private int value;
    private String text;
    private String description;
}
