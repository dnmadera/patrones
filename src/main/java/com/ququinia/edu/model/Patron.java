package com.ququinia.edu.model;

import javax.persistence.*;

@Entity
public class Patron {

    @Id
    @GeneratedValue(
        strategy=GenerationType.IDENTITY
    )
    private Long id;

    private String name;
    private String description;

    private String action;

    public Patron() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @Override
    public String toString() {
        return "Patron{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}