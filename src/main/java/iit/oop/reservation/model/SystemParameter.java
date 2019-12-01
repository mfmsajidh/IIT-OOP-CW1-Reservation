package iit.oop.reservation.model;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SystemParameter {

    @Id
    private @Setter ObjectId _id;
    private @Getter @Setter int value;
    private @Getter @Setter String text;
    private @Getter @Setter String description;

    public String get_id() {
        return _id.toHexString();
    }
}
