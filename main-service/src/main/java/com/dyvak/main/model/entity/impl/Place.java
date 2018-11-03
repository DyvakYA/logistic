package com.dyvak.main.model.entity.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {

    @Id
    private int id;
    private String city;
    private String address;
}
