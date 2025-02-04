/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.exemplo02;

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
public class ServicePersonTest {
    
    public ServicePersonTest() {
        
        
    }
    
    
    @Test
    @DisplayName("A classe deverá retornar true caso a idade seja maior ou igual a 18")
    public void returnTrueIfAgeIsGreaterOrEqualTo18(){
    
        Pessoa p1 = new Pessoa(18);
        ServicePerson op = new ServicePerson();
        
        assertTrue(op.isAdult(p1));
    
    
    }
    
    @Test
    @DisplayName("isAdult function returns false if Person object is instanced with age less than 18y")
    public void returnFalseIfAgeIsLessThan18(){
        
        Pessoa pers = new Pessoa(17);
        ServicePerson op = new ServicePerson();
        assertFalse(op.isAdult(pers));
    
    }
    
    
    @Test
    public void returnSmtWhenPessoaIsNull(){
     Pessoa pers = new Pessoa();
     ServicePerson op = new ServicePerson();
     assertNull(op.isAdult(pers));
     
    }
    
    
    @Test 
     public void objetPersonIsNotNull(){
    Pessoa pers = new Pessoa();
    ServicePerson op = new ServicePerson();
    assertNotNull(op.isAdult(pers));
    
    }
}
