package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class validationentity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Notnull
private String username;
private String email;
private String password;
private int age;
}