package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

    private int id;
    private String name;

    @Id
    @GeneratedValue
    public int getId(){
        return this.id;
    }

}
