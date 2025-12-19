package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.studentdetservice;
import com.example.demo.entity.studentdetentity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class studentdetcontroller{
  @Autowired studentdetservice ser;
  @PostMapping("/postttt")
  public studentdetentity senddata(@RequestBody studentdetentity det ){
    return ser.postdata(stu);
  }
}