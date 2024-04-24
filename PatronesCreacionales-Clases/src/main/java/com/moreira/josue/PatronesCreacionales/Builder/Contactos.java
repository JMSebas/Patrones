package com.moreira.josue.PatronesCreacionales.Builder;

public class Contactos {

    private String nombre;
    private NumeroContacto numeroContacto;
    private Direccion direccion;
    public Contactos() {}

    public Contactos(String nombre, NumeroContacto numeroContacto, Direccion direccion) {
      super();
      this.nombre = nombre;
      this.numeroContacto = numeroContacto;
      this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NumeroContacto getNroContacto() {
        return numeroContacto;
    }

    public void setNroContacto(NumeroContacto numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
