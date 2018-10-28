package model.entity;

import model.builder.ProfileBuilder;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public static ProfileBuilder builder(){
        return new ProfileBuilder();
    }
}
