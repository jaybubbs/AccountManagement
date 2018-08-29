package com.qa.app;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="ACCOUNT")
public class Account{
    public Account(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AccNo;

    @Column(length=50)
    private String firstName;

    @Column(length=50)
    private String lastName;



}
