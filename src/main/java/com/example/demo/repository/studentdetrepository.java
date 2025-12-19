package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.studentdetentity;

@Repository
public interface studentdetrepository extends JpaRepository<studentdetentity,Integer>{

}