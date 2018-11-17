package com.dyvak.main.model.entity.impl;

import com.dyvak.main.model.entity.enums.RoleType;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;


@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Profile {

    @Id
    private int id;

    private RoleType role;

    @Email
    private String email;

    private Date birthDate;

    public int getId() {
        return id;
    }

}
