/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author paulp
 */

public class Persona {
    public String nombre;
    public String nacimiento;
    public String nacionalidad;
    public int edad;
    
    public static void main(String[] args) {
       
       Persona persona1 = new Persona(); 
       persona1.nombre="Antonella";
       persona1.nacimiento="Cuenca";
       persona1.nacionalidad ="Ecuatoriana";
       persona1.edad= 18;
       
       System.out.println("Su nombre es: "+persona1.nombre);
       System.out.println("Su lugar de nacimiento es: "+persona1.nacimiento);
       System.out.println("Su nacionalidad es: "+persona1.nacionalidad);
       System.out.println("Su edad es: "+persona1.edad);
       
       Persona persona2 = new Persona(); 
       persona2.nombre="Miguel";
       persona2.nacimiento="Guayaquil";
       persona2.nacionalidad ="Ecuatoriano";
       persona2.edad= 25;
       
       System.out.println("\nSu nombre es: "+persona2.nombre);
       System.out.println("Su lugar de nacimiento es: "+persona2.nacimiento);
       System.out.println("Su nacionalidad es: "+persona2.nacionalidad);
       System.out.println("Su edad: "+persona2.edad);   
    }
}
