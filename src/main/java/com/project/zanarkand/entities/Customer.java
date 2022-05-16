package com.project.zanarkand.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
public class Customer extends IdClass{

    private String name;
    private String phoneNumber;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList;
}
