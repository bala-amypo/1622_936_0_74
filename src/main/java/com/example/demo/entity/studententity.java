package com.example.demo.entity;
@Entity
public class studententity{
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
}