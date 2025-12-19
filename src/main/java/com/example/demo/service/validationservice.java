package com.example.demo.service;
import com.example.demo.entity.validationentity;

public interface validationservice{
validationentity postdata(validationentity val);
  validationentity getdata(Long id);
}