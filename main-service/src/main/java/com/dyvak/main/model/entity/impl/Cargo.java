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

    private String number;
    private double weight;
    private CargoCategory cargoCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CargoCategory getCargoCategory() {
        return cargoCategory;
    }

    public void setCargoCategory(CargoCategory cargoCategory) {
        this.cargoCategory = cargoCategory;
    }
}
