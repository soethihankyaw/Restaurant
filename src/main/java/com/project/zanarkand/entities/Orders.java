package com.project.zanarkand.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Orders extends IdClass{

    private double price;
    private int qty;
    private double total = price * qty;
    @Column(name = "order_date")
    private Date orderDate;
    private String orderStatus;

    @OneToMany(mappedBy = "orders")
    private List<Food> foodList = new ArrayList<>();

    @OneToMany(mappedBy = "orders")
    private List<Drink> drinkList = new ArrayList<>();

    @ManyToOne
    private Customer customer;
}
