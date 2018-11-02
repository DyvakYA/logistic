package com.dyvak.main.model.entity;

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

}
