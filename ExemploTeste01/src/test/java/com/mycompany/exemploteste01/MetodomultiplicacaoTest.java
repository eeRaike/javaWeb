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

/**
 *
 * @author Aluno
 */
public class MetodomultiplicacaoTest {
    
    public MetodomultiplicacaoTest() {
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
     * Test of multiplicar method, of class Metodomultiplicacao.
     */
    @Test
    public void expect30multiply15w2() {
        Metodomultiplicacao op = new Metodomultiplicacao();
        assertEquals(30, op.multiplicar(15, 2));
        
    }
    
    @Test
    public void expect30multiply15w3FailureExpected(){
        Metodomultiplicacao op = new Metodomultiplicacao();
        assertEquals(30,op.multiplicar(15, 3));
    
    
    }
    
}
