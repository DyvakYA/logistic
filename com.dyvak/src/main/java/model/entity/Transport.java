package model.entity;

import model.builder.TransportBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transport {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public static TransportBuilder builder() {
        return new TransportBuilder();
    }
}
