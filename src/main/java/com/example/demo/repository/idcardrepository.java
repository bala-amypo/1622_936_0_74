package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.idcardentity;

@Repository
public interface idcardrepository extends JpaRepository<idcardentity,Integer>{

}