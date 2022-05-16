package com.project.zanarkand.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
public class Drink extends IdClass{

    private String name;
    private double price;
    private String description;
    private String size;
    private String image;
    private String status;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Orders orders;
}
