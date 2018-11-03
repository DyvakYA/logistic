package com.dyvak.main.model.entity.enums;

public enum RoleType {

    USER("user", 1),
    ADMIN("admin", 2);

    private String role;
    private int index;

    RoleType(String role, int index) {
        this.role = role;
        this.index = index;
    }

    public String getRole() {
        return role;
    }

    public int getIndex() {
        return index;
    }
}
