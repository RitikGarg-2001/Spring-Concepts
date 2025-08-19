package com.example.jpa_query.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa_query.entities.Student;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer>{
  
	Student findByName(String name);
//    Student findByAddress(String address);

    // if more than one record is found(so we can create a list)
    List<Student> findByNameOrAddress(String nm, String add);
}
