package model.dto;

import model.builder.UserBuilder;

public class UserDto {

    public static UserBuilder builder(){
        return new UserBuilder();
    }
}
