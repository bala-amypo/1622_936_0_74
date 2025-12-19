package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class timestampentity{
@Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 private String username;
 private String password;
 private String email;
 private Date created;
}