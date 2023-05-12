package com.example.demo.controller;

import com.example.demo.dto.Response;
import com.example.demo.dto.StudentObj;
import com.example.demo.entity.Student;
import com.example.demo.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/student")
public class Controller {

    final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    //    post
    @PostMapping()
    public ResponseEntity<Response> addStudent(@RequestBody Student request){
        return ResponseEntity.ok(service.saveStudent(request));
    }

//    get
    @GetMapping()
    public ResponseEntity<Student> getStudentById(@RequestParam Integer id){
        return ResponseEntity.ok(service.getStud(id));
    }
    @GetMapping("/all")
    public  ResponseEntity<Object> getStudents(){
        return ResponseEntity.ok(service.getStudents());
    }
//    put
//    delete
}
