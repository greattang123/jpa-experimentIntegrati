package com.example.jpaexperiment.example1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String detail;
    @ManyToOne
    private User user;
    public Address(String detail){
        this.detail=detail;
    }
}
