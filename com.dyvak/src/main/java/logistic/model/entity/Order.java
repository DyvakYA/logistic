package logistic.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    @Id
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

}
