package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

@Entity
@Data
public class studententity{
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 private String username;
 private String password;
 private String email;
 private Date created;
//  public void setId(Integer id){
//     this.id=id;
//  }
//  public void setUsername(String username){
//     this.username=username;
//  }
//  public void setEmail(String email){
//     this.email=email;
//  }
//  public void setPassword(String password){
//     this.password=password;
//  }
//  public void setCreated(Date created){
//     this.created=created;
//  }
//  public Integer getId(){
//     return id;
//  }
//  public String getUsername(){
//     return username;
//  }
//  public String getEmail(){
//     return email;
//  }
//  public String getPassword(){
//     return password;
//  }
//  public Date getCreated(){
//     return created;
//  }
//  public studententity(){

//  }
//  public studententity(Integer id,String username,String email,String password,Date created){
//     this.id=id;
//     this.username=username;
//     this.email=email;
//     this.password=password;
//     this.created=created;
//  }
}