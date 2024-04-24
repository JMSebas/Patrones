package com.moreira.josue;
import com.moreira.josue.PatronesCreacionales.Builder.Empleado;

/**
 * Hello world!
 *
 */
public class App  {
    public static void main( String[] args ) {
//        System.out.println("Hello World!");
//       Student studentA = Student.getSingletonInstance("Daniel", "Osorio", "Facultad de Ingenieria");
//        System.out.println(studentA.toString());
//
//
//        System.out.println("**************************************************");
//        Student studentB = Student.getSingletonInstance("Maria ", "Guerra", "Facultad de Ingenieria");
////        System.out.println(studentB.toString());


        Empleado empleado = new Empleado.EmpleadoBuilder()
                .setNombre("Josue")
                .setApellido("Moreira")
                .setEdad(20)
                .setGenero("Masculino")
                .setDireccion("Av. Jacome Clavijo y Celiano Monge", "Ambato", "180103")
                .build();

        System.out.println(empleado.toString());
    }
}
