package com.dyvak.main.model.entity.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    @Id
    private int id;

    @NotNull
    @Length(min = 3, max = 20)
    private String firstName;

    @NotNull
    @Length(min = 3, max = 20)
    private String lastName;

    @NotNull
    @Length(min = 3, max = 20)
    private String phoneNumber;

    @NotNull
    @Length(min = 14, max = 14)
    private long inn;

    @NotNull
    @Length(min = 18, max = 65)
    private String age;

    @NotNull
    private Date birthDate;

    private Passport passport;
    private DriverCertificate driverCertificate;
    private MedicalCertificate medicalCertificate;
    private TransportInsurance indurance;


}
