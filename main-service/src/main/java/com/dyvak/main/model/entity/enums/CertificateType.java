package com.dyvak.main.model.entity.enums;

public enum CertificateType {

    PASSPORT("Passport", 1),

    DRIVER_LICENSE("DriverLicense", 2);

    private String certificateType;
    private int index;

    CertificateType(String certificateType, int index) {
        this.certificateType = certificateType;
        this.index = index;
    }


}
