/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author paulp
 */
public class Casa {
    private String Color;
    private String Modelo;
    private String Ubicacion;
    private String Material;
    
    public static void main(String[] args) {
          
       Casa casa1 = new Casa();  
       casa1.Color = "Amarillo";
       casa1.Modelo = "Moderna";
       casa1.Ubicacion ="Chaullabamba";
       casa1.Material = "Ladrillo";
       
       System.out.println("El color de la casa es: "+casa1.Color);
       System.out.println("El modelo de la casa es: "+casa1.Modelo);
       System.out.println("Se encuentra ubicado en: "+casa1.Ubicacion);
       System.out.println("El material utilizado es: "+casa1.Material);
       
       Casa casa2 = new Casa(); 
       casa2.Color = "Cafe";
       casa2.Modelo = "Rustica";
       casa2.Ubicacion ="Control Sur";
       casa2.Material = "Adobe";
       

       System.out.println("\nEl color del carro es: "+casa2.Color);
       System.out.println("El modelo de la casa es: "+casa2.Modelo);
       System.out.println("Se encuentra ubicado en: "+casa2.Ubicacion);
       System.out.println("El material utilizado es: "+casa2.Material);
    }  
}
