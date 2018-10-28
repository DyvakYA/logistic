package model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transport")
public class Transport {

    private int id;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
}
