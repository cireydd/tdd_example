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
public class BeautifyTest {
    
    private Calculadora calc;
    
    public BeautifyTest() {
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
    public void quitarUnEspacio() throws Exception{
        String res = calc.beautify("2 + 3");
        assertEquals("2+3",res);            
    }
    
    @Test
    public void quitarVariosEspacios() throws Exception{
        String res = calc.beautify(" 2   +  3               ");
        assertEquals("2+3",res);            
    }
    
    @Test
    public void cambiarSumaNegativoAResta() throws Exception{
        String res = calc.beautify(" 3+-2");
        assertEquals("3-2",res);
    }
    
    @Test
    public void cambiarSNARQuitarEspacio() throws Exception{
        String res = calc.beautify(" 3    + -   2");
        assertEquals("3-2",res); 
    }
    @Test
    public void cambiarRestaNegativoASuma() throws Exception{
        String res = calc.beautify("3--2");
        assertEquals("3+2",res);
    }

    @Test
    public void resolverEnsaladaSignosSR(){
        
        assertThrowsExactly(Exception.class, () ->{
            String res = calc.beautify("2++--+-+--+3");
        });
    }

    @Test
    public void resolverEnsaladaSignosSREspacios(){
        
        assertThrowsExactly(Exception.class, () ->{
            String res = calc.beautify("2++ --+    -+-- +3");
        });
    }
}
