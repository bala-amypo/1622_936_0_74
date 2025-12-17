package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Date;
@Entity
public class studententity{
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer id;
 private String username;
 private String password;
 private String email;
 private Date created;
 public void setid(Integer id){
    this.id=id;
 }
 public void setusername(String username){
    this.username=username;
 }
 public void setemail(String email){
    this.email=email;
 }
 public void setpassword(String password){
    this.password=password;
 }
 public void setcreated(Date created){
    this.created=created;
 }
 public Integer getid(){
    return id;
 }
 public String getusername(){
    return username;
 }
 public String getemail(){
    return email;
 }
 public String getpassword(){
    return password;
 }
 public Date getcreated(){
    return created;
 }
 public studententity(){

 }
 public studententity(Integer id,String username,String email,String password,Date created){
    this.id=id;
    this.username=username;
    this.email=email;
    this.password=password;
    this.created=created;
 }
}