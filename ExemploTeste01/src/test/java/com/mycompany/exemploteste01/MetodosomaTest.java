/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exemploteste01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Aluno
 */
public class MetodosomaTest {
    
    public MetodosomaTest() {
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
     * Test of soma method, of class Metodosoma.
     */
    @Test
    @DisplayName("A função soma, deve retornar o valor de 20, quando repassado por parâmetro, os valores de a = 10 e b = 10")
    public void funcSumReturn20forSumOfValuesOf10() {
        Metodosoma op = new Metodosoma();
        assertEquals(20, op.soma(10, 10));
    }
    
    @Test
    @DisplayName("Resultado não pode ser igual a 20, quando passarmos os valores de a = 10 e b = 11")
    public void testSoma2(){
        Metodosoma op = new Metodosoma();
        assertNotEquals(20,op.soma(10, 11));
    
    
    }
}
