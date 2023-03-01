/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

/**
 *
 * @author kevin
 */
public class Punto2 {
    public static void main(String[] args) {
        // Definir variables numéricas
        int num1 = 45;
        int num2 = 65;
        int num3 = 95;

        // Calcular suma, promedio, producto, cociente y módulo
        int suma = num1 + num2 + num3;
        double promedio = (double) suma / 3;
        int producto = num1 * num2 * num3;
        double cociente = (double) num2 / num1;
        int modulo = num3 % num2;

      
        System.out.printf("Suma: %.2f\n", (double) suma);
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.printf("Producto: %.2f\n", (double) producto);
        System.out.printf("Cociente: %.2f\n", cociente);
        System.out.printf("Módulo: %.2f\n", (double) modulo);
    }
}
