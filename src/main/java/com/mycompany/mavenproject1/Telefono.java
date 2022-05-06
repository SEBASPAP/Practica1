/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author paulp
 */
public class Telefono {

    private String Operadora;
    private String modelo;
    private int peso;
    private int capacidad;
    
    public static void main(String[] args) {
        
       Telefono telf1 = new Telefono(); 
       telf1.Operadora = "Claro";
       telf1.peso= 150;
       telf1.modelo= "Iphone 11 Pro";
       telf1.capacidad= 32;
       System.out.println("El nombre es: "+telf1.Operadora);
       System.out.println("El peso en gramos es: "+telf1.peso);
       System.out.println("El  modelo es: "+telf1.modelo);
       System.out.println("La capacidad en GB es: "+telf1.capacidad);
       
       Telefono telf2 = new Telefono(); 
       telf2.Operadora = "Movistar";
       telf2.peso= 178;
       telf2.modelo= "REDMI NOTE 8";
       telf2.capacidad= 128;
       System.out.println("\nEl nombre es: "+telf2.Operadora);
       System.out.println("El peso en gramos es: "+telf2.peso);
       System.out.println("El  modelo es: "+telf2.modelo);
       System.out.println("La capacidad en GB es: "+telf2.capacidad);
    } 
}
