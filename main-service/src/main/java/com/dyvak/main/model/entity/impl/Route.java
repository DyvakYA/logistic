package com.dyvak.main.model.entity.impl;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {

    @Id
    private int id;

    public int getId() {
        return id;
    }

}
