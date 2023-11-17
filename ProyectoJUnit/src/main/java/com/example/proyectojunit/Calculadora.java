/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.proyectojunit;

/**
 *
 * @author Toni
 */
public class Calculadora {
    
    
    public int resuelve(String x) throws Exception {
        String entrada = beautify(x);
        int resultado = -10000;
        if(entrada.matches("^[0-9]\\+[0-9]$")){
            String operandos [] = entrada.split("\\+");
            resultado = sumar(Integer.parseInt(operandos[0]),Integer.parseInt(operandos[1]));
        }

        return resultado;
    }
    
    public int sumar(int x, int y) throws Exception {
        if(x<0 || y<0) {
            throw new Exception("El valor de x o y no puede ser menor a 0");
        }
        //Thread.sleep(1500);
        return x+y;
    }
    
    
    public int restar(int x, int y) throws Exception {
        if(x<0 || y<0) {
            throw new Exception("El valor de x o y no puede ser menor a 0");
        }
        //Thread.sleep(1500);
        return x-y;       
    }
    
    
    public int multiplicar(int x, int y) throws Exception {
        if(x<0 || y<0) {
            throw new Exception("El valor de x o y no puede ser menor a 0");
        }
        //Thread.sleep(1500);
        return x*y;       
    }
        
    public int dividir(int x, int y) throws Exception {
        if(x<0 || y<0) {
            throw new Exception("El valor de x o y no puede ser menor a 0");
        }
        if(y==0){
            throw new Exception("El divisor no puede ser 0");
        }
        //Thread.sleep(1500);
        return x/y;       
    }
    
    public String beautify (String x) throws Exception {
        x = x.replaceAll(" ", "");      
        if(x.matches("^[0-9][\\+\\-]{3,}[0-9]$")){
            throw new Exception("Signos de operacion incorrectos");
        }

        x = x.replaceAll("\\+-", "-");
        x = x.replaceAll("--", "\\+");
        return x;
    }
}