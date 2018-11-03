package com.dyvak.main.model.entity.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    @Id
    private int id;
    private String number;
    private Driver driver;
    private Transport transport;
    private List<Trailer> trailers;
    private Route route;


    public int getId() {
        return this.id;
    }

}
