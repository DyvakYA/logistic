package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.RouteItem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop implements RouteItem {

    @Id
    private int id;
    private Place place;
    private Date beginDate;
    private Date endDate;


}
