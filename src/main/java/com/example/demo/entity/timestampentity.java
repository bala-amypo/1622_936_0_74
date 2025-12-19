package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class timestampentity{
@Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String username;
 private String email;
 private LocalDateTime createdat;
 private LocalDateTime updatedat;
 
}