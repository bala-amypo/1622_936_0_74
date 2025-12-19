package com.example.demo.entity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
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
 @PrePersist
 public void Oncreate(){
 LocalDateTime now = LocalDateTime.now();
 this.createdat=now;
 this.updatedat=now;
 }
 @PreUpdate
 public void Onupdate(){
 LocalDateTime now = LocalDateTime.now();
 this.updatedat=now;
 }
}