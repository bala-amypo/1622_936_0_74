package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.timestampservice;
import com.example.demo.entity.timestampentity;
import com.example.demo.repository.timestamprepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class timestampserviceimpl implements timestampservice{
    @Autowired timestamprepository student;
    @Override
   public timestampentity postdata(timestampentity time){
    return student.save(time);
        }
}