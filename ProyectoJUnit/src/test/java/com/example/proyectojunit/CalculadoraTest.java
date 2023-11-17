/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.proyectojunit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Toni
 */
public class CalculadoraTest {
    
    private Calculadora calc;
    
    public CalculadoraTest() {
        //this.calc = new Calculadora();
    }

    @BeforeEach
    public void setUp(){
        System.out.println("== setUp ==");
        this.calc = new Calculadora();
    }
    
    @Test
    public void puedoInstanciarMiCalculadora() {
        //Calculadora calc = new Calculadora();
        
        assertNotNull(calc);
        assertTrue(calc instanceof Calculadora);
        //Ojo a la versión de Jupiter. 5.10
        assertInstanceOf(Calculadora.class, calc);
    }
    
    @Test
    public void puedoSumar2y2() throws Exception {
        //Calculadora calc = new Calculadora();
        int res = calc.sumar(2,2);
        assertEquals(4, res);
    }
    @Test
    public void puedoSumar4y5() throws Exception {
        //Calculadora calc = new Calculadora();
        int res = calc.sumar(4,5);
        assertEquals(9, res);
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
