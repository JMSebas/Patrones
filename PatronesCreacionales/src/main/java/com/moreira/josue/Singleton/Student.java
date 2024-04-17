package com.moreira.josue.Singleton;

public class Student {
    private String name;
    private String lastName;
    private  String faculty;

    private static Student student;

    private Student(String name, String lastName, String faculty){
        super();
        this.name = name;
        this.lastName = lastName;
        this.faculty = faculty;

//        System.out.println("Mi object es: " + this.toString());
        System.out.println(this.toString());
    }


    public static Student getSingletonInstance(String name, String lastName, String faculty){
        if (student == null){
            student = new Student(name, lastName, faculty);
        }else {
            System.out.println("No se puede crear el object.");
        }
        return student;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.name + "\n Apellido: "+ this.lastName + "\n Facultad: "+ this.faculty;
    }
}
