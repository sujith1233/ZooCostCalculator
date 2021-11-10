/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo01group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anurag Kolluru
 */
public class AquaticAnimalTest {
    AquaticAnimal aquaticObj;
    
    public AquaticAnimalTest() {
        this.aquaticObj = new AquaticAnimal(1,true,1,1,"Anurag");
    }

    /**
     * Test of speak method, of class AquaticAnimal.
     */
    @Test
    public void testSpeak() {
        String expected = "Generic speak method";
        String actual = aquaticObj.speak();
        assertEquals(expected,actual);
    }

    /**
     * Test of move method, of class AquaticAnimal.
     */
    @Test
    public void testMove() {
        String expected = "Generic move method";
        String actual = aquaticObj.move();
        assertEquals(expected,actual);
    }

    /**
     * Test of getWaterDepth_meters method, of class AquaticAnimal.
     */
    @Test
    public void testGetWaterDepth_meters() {
        assert(true);
    }

    /**
     * Test of getWatchTime method, of class AquaticAnimal.
     */
    @Test
    public void testGetWatchTime() {
        assert(true);
    }

    /**
     * Test of setWaterDepth_meters method, of class AquaticAnimal.
     */
    @Test
    public void testSetWaterDepth_meters() {
        assert(true);
    }

    /**
     * Test of setWatchTime method, of class AquaticAnimal.
     */
    @Test
    public void testSetWatchTime() {
        assert(true);
    }
    
}
