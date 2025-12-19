package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.timestampservice;
import com.example.demo.entity.timestampentity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class studentcontroller{
  @Autowired studentservice ser;
  @PostMapping("/postttt")
  public studententity sendddata(@RequestBody studententity stu ){
    return ser.postdata(stu);
  }