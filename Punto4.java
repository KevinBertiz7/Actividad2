/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author kevin
 */
public class Punto4 {
    
     public static void main(String[] args) {
        
        int diasViaje = 7; 
        double kmPorDia = 100.0; 
        double costoGasolina = 1.0; 
        double kmPorLitro = 10.0; 
        double pagoEstacionamientoPorDia = 5.0; 
        double pagoPeajesPorDia = 10.0; 

       
        double costoGasolinaPorDia = kmPorDia / kmPorLitro * costoGasolina;
        double costoTotalPorDia = costoGasolinaPorDia + pagoEstacionamientoPorDia + pagoPeajesPorDia;
        double costoTotal = costoTotalPorDia * diasViaje;

        
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);
    }
}
