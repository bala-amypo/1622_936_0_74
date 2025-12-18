package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
@Entity
public class validationentity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min = 2,max = 6,message = "must be 2 to 6 characters")
private String username;
@Email(message "Email is not valid")
private String email;
@Max(6)
@NotNull(message = "")
private String password;
private int age;
}