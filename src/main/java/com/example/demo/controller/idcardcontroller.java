package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.idcardservice;
import com.example.demo.entity.idcardentity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class idcardcontroller{
  @Autowired idcardservice ser;
  @PostMapping("/posts")
  public idcardentity senddata(@RequestBody idcardentity stu ){
    return ser.postdata(stu);
  }
  }