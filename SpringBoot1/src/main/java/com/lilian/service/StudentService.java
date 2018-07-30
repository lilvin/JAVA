package com.lilian.service;

import com.lilian.Dao.StudentDao;
import com.lilian.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service

public class StudentService {
    @Autowired
    private StudentDao StudentDao;

    public Collection<Student> getAllStudents(){

        return this.StudentDao.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.StudentDao.getStudentById(id);
    }
}
