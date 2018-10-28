package model.dto;

import model.builder.OrderBuilder;

public class OrderDto {

    public static OrderBuilder builder(){
        return new OrderBuilder();
    }
}
