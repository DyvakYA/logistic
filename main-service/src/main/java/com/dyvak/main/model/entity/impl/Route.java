package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.RouteItem;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {

    @Id
    private int id;

    private List<RouteItem> routeItems;

    public int getId() {
        return id;
    }

}
