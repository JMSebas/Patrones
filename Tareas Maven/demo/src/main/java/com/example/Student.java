package com.example;

import java.time.LocalDate;

public class Student extends Person {
    
      private String studentId;

    
    public Student(String firstName, String lastName, LocalDate birthDate, String studentId) {
        super(firstName, lastName, birthDate);
        this.studentId = studentId;
    }

    public void setStudentID(String studentId){
      this.studentId = studentId;
    }

    public String getStudentId(){
        return this.studentId;
    }
}

