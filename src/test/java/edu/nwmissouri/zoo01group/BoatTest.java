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
 * @author Pandiri Govinda Reddy
 */
public class BoatTest {
    Boat boatObj;
    
    public BoatTest() {
        this.boatObj=new Boat();
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
     * Test of getmaxSpeed_mileperhour method, of class Boat.
     */
    @Test
    public void testGetmaxSpeed_mileperhour() {
        Boat instance = new Boat();
        double expResult = 0.0;
        double result = instance.getmaxSpeed_mileperhour();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setmaxSpeed_mileperhour method, of class Boat.
     */
    @Test
    public void testSetmaxSpeed_mileperhour() {
        double maxSpeed_mileperhour = 0.0;
        Boat instance = new Boat();
        instance.setmaxSpeed_mileperhour(maxSpeed_mileperhour);
       
    }

    /**
     * Test of getCapacity method, of class Boat.
     */
    @Test
    public void testGetCapacity() {
        Boat instance = new Boat();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCapacity method, of class Boat.
     */
    @Test
    public void testSetCapacity() {
        int capacity = 0;
        Boat instance = new Boat();
        instance.setCapacity(capacity);
        
    }

    /**
     * Test of getperHourPrice_dollars method, of class Boat.
     */
    @Test
    public void testGetperHourPrice_dollars() {
        Boat instance = new Boat();
        double expResult = 0.0;
        double result = instance.getperHourPrice_dollars();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setperHourPrice_dollars method, of class Boat.
     */
    @Test
    public void testSetperHourPrice_dollars() {
        double perHourPrice_dollars = 0.0;
        Boat instance = new Boat();
        instance.setperHourPrice_dollars(perHourPrice_dollars);
       
    }

    /**
     * Test of boatSeating method, of class Boat.
     */
    @Test
    public void testBoatSeating() {
        var expected=40;
        boatObj.setCapacity(40);
        var actual=boatObj.boatSeating();
        assertEquals(expected,actual);
        
        
    }

    /**
     * Test of milesPerHour method, of class Boat.
     */
    @Test
    public void testMilesPerHour() {
        double expected=100.00;
        boatObj.setmaxSpeed_mileperhour(100.00);
        double actual=boatObj.milesPerHour();
        assertEquals(expected,actual);
        
    }
    
}
