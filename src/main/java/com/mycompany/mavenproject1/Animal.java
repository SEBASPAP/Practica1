/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author paulp
 */
public class Animal {
    
    private String nombre;
    private String color;
    private String raza;
    private int peso;
    
    public static void main(String[] args) {
         
       Animal animal1 = new Animal(); 
       animal1.nombre = "Chispas";
       animal1.color = "Cafe";
       animal1.raza = "Golden";
       animal1.peso = 25;
       
       System.out.println("El nombre es: "+animal1.nombre);
       System.out.println("Su color es: "+animal1.color);
       System.out.println("Pertenece a la raza: "+animal1.raza);
       System.out.println("Su peso es de: "+animal1.peso);
       
       
       
       Animal animal2 = new Animal(); 
       animal2.nombre = "Shadow";
       animal2.color = "Gris";
       animal2.raza = "Egipcio";
       animal2.peso = 8;
       
       System.out.println("\nEl nombre es: "+animal2.nombre);
       System.out.println("Su color es: "+animal2.color);
       System.out.println("Pertenece a la raza: "+animal2.raza);
       System.out.println("Su peso es de: "+animal2.peso);
    }
}