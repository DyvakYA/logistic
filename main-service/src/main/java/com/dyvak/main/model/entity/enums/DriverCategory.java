package com.dyvak.main.model.entity.enums;

public enum DriverCategory {

    A1("A1", 1),

    A("A", 2),

    B1("B1",3),

    B("B",4),

    C1("C1",5),

    C("C",6),

    D1("D1",7),

    D("D",8),

    BE("BE",9),

    C1E("C`E",10),

    CE("CE",11),

    D1E("D1E",12),

    DE("DE",13);

    private String category;
    private int index;

    DriverCategory(String category, int index) {
        this.category = category;
        this.index = index;
    }

    public String getCategory() {
        return category;
    }

    public int getIndex() {
        return index;
    }


}
