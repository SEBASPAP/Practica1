/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author paulp
 */
public class Propietario {
    public String nombre;
    public String direccion;
    public int telefono;
    public int Edad;
    
    public static void main(String[] args) {
       
       Propietario propietario1 = new Propietario(); 
       propietario1.nombre="Antonella";
       propietario1.direccion="Cordillera y Bueran";
       propietario1.telefono = 593098790;
       propietario1.Edad= 23;
       
       System.out.println("Su nombre es: "+propietario1.nombre);
       System.out.println("Su nombre es: "+propietario1.direccion);
       System.out.println("Su nombre es: "+propietario1.telefono);
       System.out.println("Su nombre es: "+propietario1.Edad);
       
       Propietario propietario2 = new Propietario(); 
       propietario2.nombre="Melanie";
       propietario2.direccion="Calle de Arupo";
       propietario2.telefono = 593587444;
       propietario2.Edad= 16;
       
       System.out.println("\nSu nombre es: "+propietario2.nombre);
       System.out.println("Su nombre es: "+propietario2.direccion);
       System.out.println("Su nombre es: "+propietario2.telefono);
       System.out.println("Su nombre es: "+propietario2.Edad);
    }
}
