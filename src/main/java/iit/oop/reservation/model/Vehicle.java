package iit.oop.reservation.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("vehicle")
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "Type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Motorbike.class, name = "Motorbike"),
        @JsonSubTypes.Type(value = Car.class, name = "Car")
})
public class Vehicle {

    @Id
    private @Setter ObjectId _id;

    private @Getter @Setter String numberPlate;
    private @Getter @Setter String type;
    private @Getter @Setter String model;

    public String get_id() {
        return _id.toHexString();
    }
}
