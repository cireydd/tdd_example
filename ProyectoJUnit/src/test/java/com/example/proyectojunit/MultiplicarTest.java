/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.proyectojunit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RNGHater
 */
public class MultiplicarTest {
    
    private Calculadora calc;
    
    public MultiplicarTest() {
    }
    
    @BeforeEach
    public void setUp(){
        System.out.println("== setUp ==");
        this.calc = new Calculadora();
    }   
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
    @Test
    public void puedoMultiplicar3y2() throws Exception {
        //Calculadora calc = new Calculadora();
        int res = calc.multiplicar(3,2);
        assertEquals(6, res);
    }

    @Test
    public void puedoMultiplicar4ymenos5() {
        //el assert Throws espera que el cacho de código del segundo bloque acabe produciendo esta excepcion, o una hija de
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.multiplicar(4,-5);
            assertEquals(-20, res);
        });
        
    }
    
    @Test
    public void puedoMultiplicarmenos4y5(){
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.multiplicar(-4,5);
            assertEquals(-20, res);
        });
    }
    
    @Test
    public void laMultiplicacionNoTardaMasDe1s(){
        assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> {
            calc.multiplicar(4,5);
        });
    }
    
}
