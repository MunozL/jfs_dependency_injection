package com.example.jfs_dependency_injection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private StudentConfig studentConfig;

    public StudentService(StudentConfig studentConfig){
        this.studentConfig = studentConfig;
    }

    public List<Student>getStudents(){
            return studentConfig.students;
    }

}
