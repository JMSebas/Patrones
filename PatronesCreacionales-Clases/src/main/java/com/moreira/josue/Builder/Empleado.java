package com.moreira.josue.Builder;

import com.moreira.josue.Builder.interfaces.BuilderInterface;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private Direccion direccion;
    private List<NumeroContacto> numeros = new ArrayList();
    private List<Contactos> contactos = new ArrayList();

     public Empleado(String nombre, String apellido, int edad, String genero, Direccion direccion, List<NumeroContacto> numeros, List<Contactos> contactos  ) {
         super();
         this.nombre = nombre;
         this.apellido = apellido;
         this.edad = edad;
         this.genero = genero;
         this.direccion = direccion;
         this.numeros = numeros;
         this.contactos = contactos;

     }
    public Empleado(){
        super();
    }

    public static class EmpleadoBuilder implements BuilderInterface {
        private String nombre;
        private String apellido;
        private int edad;
        private String genero;
        private Direccion direccion;
        private List<NumeroContacto> numeros = new ArrayList();
        private List<Contactos> contactos = new ArrayList();

        public EmpleadoBuilder(){
            super();
        }

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }
        public EmpleadoBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }
        public EmpleadoBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }
        public EmpleadoBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }
        public EmpleadoBuilder setNumeros(List<NumeroContacto> numeros) {
            this.numeros = numeros;
            return this;
        }

        public EmpleadoBuilder setContactos(List<Contactos> contactos) {
            this.contactos = contactos;
            return this;
        }
         @Override
         public Empleado build() {
             return new Empleado();
         }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
