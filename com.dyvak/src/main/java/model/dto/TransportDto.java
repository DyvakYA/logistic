package model.dto;

import model.builder.TransportBuilder;

public class TransportDto {

    public static TransportBuilder builder(){
        return new TransportBuilder();
    }
}
