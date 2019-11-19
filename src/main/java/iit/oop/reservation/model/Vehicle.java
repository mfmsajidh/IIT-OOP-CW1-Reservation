package iit.oop.reservation.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonTypeInfo(use = NAME, include = PROPERTY)
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = Car.class, name = "Car"),
//        @JsonSubTypes.Type(value = Motorbike.class, name = "Motorbike")
//})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Car.class, name = "Car"),
        @JsonSubTypes.Type(value = Motorbike.class, name= "Motorbike")
})
public class Vehicle {

    @Id
    private String id;

    private String numberPlate;
    private String type;
    private String model;

}
