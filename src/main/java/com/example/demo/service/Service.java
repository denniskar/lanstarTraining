package com.example.demo.service;

import com.example.demo.dto.Response;
import com.example.demo.dto.StudentObj;
import com.example.demo.entity.Student;
import com.example.demo.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
//    create a Constructor
    public final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }
    public Student getStud(Integer id){
        System.out.println("In service");
        return repository.findById(id).get();
    }
    public Response saveStudent(Student request){
        try {
            repository.save(request);
        }
        catch (Exception e){
            return Response.failure("Could not save record");
        }

        return Response.success("success");
    }

    public Object getStudents() {
        List students = new ArrayList();
        List<Student> all = repository.findAll();

        all.stream().forEach(student -> students.add(student));
        return students;

    }
//    business logic

}
