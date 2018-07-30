package com.lilian.controller;

import com.lilian.Entity.Student;
import com.lilian.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

import java.util.Collection;
@RestController
@RequestMapping("/Students")

public class StudentController {
    @Autowired
    private StudentService StudentService;
    @RequestMapping(method = RequestMethod.GET)

    public Collection<Student> getAllStudents(){

        return StudentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return StudentService.getStudentById( id);
    }
}
