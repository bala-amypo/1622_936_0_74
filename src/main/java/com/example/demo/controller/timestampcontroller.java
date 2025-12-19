package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.timestampservice;
import com.example.demo.entity.timestampentity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class timestampcontroller{
  @Autowired timestampservice ser;
  @PostMapping("/postttt")
  public timestampentity sendddata(@RequestBody timestampentity time){
    return ser.postdata(time);
  }
}