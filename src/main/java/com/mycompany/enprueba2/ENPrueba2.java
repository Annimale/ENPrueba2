/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enprueba2;

/**
 *
 * @author skril
 */
public class ENPrueba2 {

   public  String determinarTipoTriangulo(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Los lados deben tener valores positivos.";
        }
        
        if (a == b && b == c) {
            return "El triángulo es equilátero.";
        } else if (a == b || b == c || c == a) {
            return "El triángulo es isósceles.";
        } else {
            return "El triángulo es escaleno.";
        }
    }
}
