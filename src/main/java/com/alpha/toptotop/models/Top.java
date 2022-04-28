package com.alpha.toptotop.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Top {

    @Id
    private String id;
    private String colour;
    private String size;
    private String type;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Top{}";
    }
}
