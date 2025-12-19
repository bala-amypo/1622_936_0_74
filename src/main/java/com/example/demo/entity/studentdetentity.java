package com.example.demo.entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class studentdetentity{
   private Integer id; 
   private String name;
   private String email
   private String address;
}