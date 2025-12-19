package com.example.demo.controller;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.validationservice;
import com.example.demo.entity.validationentity;
@RestController
public class validationcontroller{
  @Autowired validationservice ser;
  @PostMapping("/postt")
  public validationentity senddata(@Valid @RequestBody validationentity val ){
    return ser.postdata(val);
  }
   }
  @GetMapping("/findd{id}")
   public validationentity gdata(@Valid @PathVariable Long id){
    return ser.getdata(id);
   }
}