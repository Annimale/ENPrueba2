/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.enprueba2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author skril
 */
public class ENPrueba2Test {
    
    public ENPrueba2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of determinarTipoTriangulo method, of class ENPrueba2.
     */
    @Test
    public void primerIF() {
        System.out.println("primerIF");
        int a = 0;
        int b = 0;
        int c = 0;
        ENPrueba2 instance = new ENPrueba2();
        String expResult = "Los lados deben tener valores positivos.";
        String result = instance.determinarTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testIsosceles() {
        System.out.println("testIsosceles");
        int a = 2;
        int b = 2;
        int c = 8;
        ENPrueba2 instance = new ENPrueba2();
        String expResult = "El triángulo es isósceles.";
        String result = instance.determinarTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testEquilatero() {
        System.out.println("testEquilatero");
        int a = 2;
        int b = 2;
        int c = 2;
        ENPrueba2 instance = new ENPrueba2();
        String expResult = "El triángulo es equilátero.";
        String result = instance.determinarTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testEscaleno() {
        System.out.println("testEscaleno");
        int a = 6;
        int b = 2;
        int c = 7;
        ENPrueba2 instance = new ENPrueba2();
        String expResult = "El triángulo es escaleno.";
        String result = instance.determinarTipoTriangulo(a, b, c);
        assertEquals(expResult, result);
       
    }
    
}
