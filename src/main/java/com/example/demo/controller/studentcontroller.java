package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.studentservice;
import com.example.demo.entity.studententity;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class studentcontroller{
  @Autowired studentservice ser;
  @PostMapping("/post")
  public studententity senddata(@RequestBody studententity stu ){
    return ser.postdata(stu);
  }
}