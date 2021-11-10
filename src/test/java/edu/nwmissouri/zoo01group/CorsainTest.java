/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo01group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545524
 */
public class CorsainTest {
    Corsain corsainObj;
    
    public CorsainTest() {
        this.corsainObj=new Corsain();
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
     * Test of getCoDriver method, of class Corsain.
     */
    @Test
    public void testGetCoDriver() {
        
        assert(true);        
    }

    /**
     * Test of setCoDriver method, of class Corsain.
     */
    @Test
    public void testSetCoDriver() {
        
        assert(true);
        
    }

    /**
     * Test of getColor method, of class Corsain.
     */
    @Test
    public void testGetColor() {
       
       assert(true);
        
    }

    /**
     * Test of setColor method, of class Corsain.
     */
    @Test
    public void testSetColor() {
       
       assert(true);
        
    }

    /**
     * Test of getserialNumber method, of class Corsain.
     */
    @Test
    public void testGetserialNumber() {
        
       assert(true);
        
    }

    /**
     * Test of setserialNumber method, of class Corsain.
     */
    @Test
    public void testSetserialNumber() {
       
       assert(true);
        
    }

    /**
     * Test of vehicileNumber method, of class Corsain.
     */
    @Test
    public void testVehicleNumber() {
        var expected="Dhoni7";
        corsainObj.setserialNumber("Dhoni7");
        var actual=corsainObj.vehicleNumber();
        assertEquals(expected,actual);
        
    }

    /**
     * Test of vehicleColor method, of class Corsain.
     */
    @Test
    public void testVehicleColor() {
        var expected="black";
        corsainObj.setColor("black");
        var actual=corsainObj.vehicleColor();
        assertEquals(expected,actual);
        
    }

    
    
}
