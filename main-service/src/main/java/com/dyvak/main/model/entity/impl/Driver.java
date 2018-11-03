package com.dyvak.main.model.entity.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Driver {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private long inn;
    private String age;

    private Passport passport;
    private DriverCertificate driverCertificate;
    private MedicalCertificate medicalCertificate;
    private TransportInsurance indurance;


}
