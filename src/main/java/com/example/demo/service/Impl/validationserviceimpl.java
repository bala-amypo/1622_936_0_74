package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.validationservice;
import com.example.demo.entity.validationentity;
import com.example.demo.exception.validationexception;
import com.example.demo.repository.validationrepository;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class validationserviceimpl implements validationservice{
    @Autowired validationrepository student;
    @Override
   public validationentity postdata(validationentity val){
    return student.save(val);
        }
   @Override
    public validationentity getdata(int id){
       return student.findById(id).orElseThrow(()->new validationexception("Invalid Id"+id)); 
    }
}