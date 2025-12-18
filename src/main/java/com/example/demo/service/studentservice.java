package com.example.demo.service;
import com.example.demo.entity.studententity;
import java.util.List;

public interface studentservice {
    studententity postdata(studententity stu);
    List<studententity>getalldata();
    String deletedata(int id);
    studententity getdata(int id);
    studententity putdata(int id,studententity stu);
}