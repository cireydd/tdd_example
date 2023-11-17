/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.proyectojunit;

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
public class ResuelveTest {
    
    private Calculadora calc;
    
    public ResuelveTest() {
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
    public void SumarDosNum() throws Exception{
        int res = calc.resuelve("2+2");
        assertEquals(4,res);
    }
}
