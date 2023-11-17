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
public class DividirTest {
    
    private Calculadora calc;
    
    public DividirTest() {
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
    public void puedoDividir4y2() throws Exception {
        //Calculadora calc = new Calculadora();
        int res = calc.dividir(4,2);
        assertEquals(2, res);
    }

    @Test
    public void puedoDividir6ymenos2() {
        //el assert Throws espera que el cacho de código del segundo bloque acabe produciendo esta excepcion, o una hija de
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.dividir(6,-2);
            assertEquals(-3, res);
        });
        
    }
    
    @Test
    public void puedoDividirmenos6y2(){
        assertThrowsExactly(Exception.class, () -> {
            //Calculadora calc = new Calculadora();
            int res = calc.dividir(-6,2);
            assertEquals(-3, res);
        });
    }
    
    @Test
    public void laDivisionNoTardaMasDe1s(){
        assertTimeout(Duration.of(1, ChronoUnit.SECONDS), () -> {
            calc.dividir(6,2);
        });
    }
    @Test
    public void divisionEntreCero(){
        
        assertThrowsExactly(Exception.class, () ->{
            int res = calc.dividir(7, 0);
        });
    }
}
