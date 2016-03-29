/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej06Cap09;

/**
 *
 * @author Administrador
 */
public class PooJavaEj06Cap09 {
  
  public static void main(String[] args) {
   
    Tiempo tiempo1 = new Tiempo(0, 10, 0);
    Tiempo tiempo2 = new Tiempo(0, 0, 3000000);
    
    System.out.println(tiempo1);
    System.out.println(tiempo2);
    
    System.out.println("\nVamos a sumar ambos tiempos: ");
    //tiempo1.suma(tiempo2);
    System.out.println(tiempo1);
    
    System.out.println("===================================");
    
    System.out.println(tiempo1);
    System.out.println(tiempo2);
    
    System.out.println("\nVamos a restar ambos tiempos: ");
    tiempo1.resta(tiempo2);
    System.out.println(tiempo1);
    
    
  }
}
