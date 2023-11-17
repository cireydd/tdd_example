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
public class SumarTest {
   
    
    private Calculadora calc;
    
    public SumarTest() {
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
    public void puedoSumar2y2() throws Exception {
        //Calculadora calc = new Calculadora();
        int res = calc.sumar(2,2);
        assertEquals(4, res);
    }

    @Test
    public void puedoSumar40ymenos5() {
        //el assert Throws espera que el cacho de código del segundo bloque acabe produciendo esta excepcion, o una hija de
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.sumar(40,-5);
            assertEquals(35, res);
        });
        
    }
    
    @Test
    public void puedoSumarmenos40y5(){
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.sumar(-40,5);
            assertEquals(-35, res);
        });
    }
    
    @Test
    public void laSumaNoTardaMasDe1s(){
        assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> {
            calc.sumar(4,5);
        });
    }

}
