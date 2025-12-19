package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.studentdetservice;
import com.example.demo.entity.studentdetentity;
import com.example.demo.repository.studentdetrepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class studentdetserviceimpl implements studentdetservice{
    @Autowired studentdetrepository student;
    @Override
   public studentdetentity postdata(studentdetentity det){
    return student.save(det);
   }
        }