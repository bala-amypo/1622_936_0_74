package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.idcardservice;
import com.example.demo.entity.idcardentity;
import com.example.demo.repository.idcardrepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class idcardserviceimpl implements idcardservice{
    @Autowired idcardrepository student;
    @Override
   public idcardentity postdata(idcardentity det){
    return student.save(det);
        }
}