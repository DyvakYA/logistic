package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.enums.CargoCategory;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cargo {

    @Id
    private int id;
    private double weight;
    private CargoCategory cargoCategory;
}
