package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.Insurance;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transport {

    @Id
    private int id;
    private String registrationNumber;
    private String vin;
    private TransportInsurance insurance;

    public int getId() {
        return id;
    }

}
