package com.project.zanarkand.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
public class Employee extends IdClass{

    private String name;
    private String email;
    private String phoneNumber;
    private String role;

}
