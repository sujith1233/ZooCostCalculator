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
 * @author Akhil Kumar Reddy Mullamalla
 */
public class FourWheelerTest {

    private FourWheeler fourWheelerObj;

    public FourWheelerTest() {
        this.fourWheelerObj = new FourWheeler(50, 100);
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
     * Test of getVehicleName method, of class FourWheeler.
     */
    @Test
    public void testGetVehicleName() {
        String expResult = "Test Vehicle";
        fourWheelerObj.setVehicleName("Test Vehicle");
        String result = fourWheelerObj.getVehicleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVehicleOwner method, of class FourWheeler.
     */
    @Test
    public void testGetVehicleOwner() {
        String expResult = "Test Owner";
        fourWheelerObj.setVehicleOwner("Test Owner");
        String result = fourWheelerObj.getVehicleOwner();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVehicleOwner method, of class FourWheeler.
     */
    @Test
    public void testSetVehicleOwner() {
        assert (true);
    }

    /**
     * Test of setVehicleName method, of class FourWheeler.
     */
    @Test
    public void testSetVehicleName() {
        assert (true);
    }

    /**
     * Test of getVehicleColor method, of class FourWheeler.
     */
    @Test
    public void testGetVehicleColor() {
        String expResult = "Red";
        fourWheelerObj.setVehicleColor("Red");
        String result = fourWheelerObj.getVehicleColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVehicleColor method, of class FourWheeler.
     */
    @Test
    public void testSetVehicleColor() {
       assert(true);
    }

    /**
     * Test of getVehicleYear method, of class FourWheeler.
     */
    @Test
    public void testGetVehicleYear() {
        int expResult = 2011;
        fourWheelerObj.setVehicleYear(2011);
        int result = fourWheelerObj.getVehicleYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVehicleYear method, of class FourWheeler.
     */
    @Test
    public void testSetVehicleYear() {
        assert(true);
    }

    /**
     * Test of vehicleWorkingState method, of class FourWheeler.
     */
    @Test
    public void testVehicleWorkingState() {
        String vehicleName = "";
        boolean expResult = false;
        boolean result = fourWheelerObj.vehicleWorkingState(vehicleName);
        assertEquals(expResult, result);
        
    }

   
}
