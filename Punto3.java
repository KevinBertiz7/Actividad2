/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author kevin
 */
public class Punto3 {
    public static void main(String[] args) {
        
        double costo = 500.0; 
        double porcentajeIVA = 0.19; 
        double porcentajeUtilidad = 0.50; 

        
        double precioVenta = costo * (1 + porcentajeIVA) * (1 + porcentajeUtilidad);

        
        System.out.printf("El precio de venta del artículo es: %.2f\n pesos", precioVenta);
    }
    
}
