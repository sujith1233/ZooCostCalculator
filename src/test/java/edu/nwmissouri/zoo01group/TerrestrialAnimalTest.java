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
public class TerrestrialAnimalTest {
    TerrestrialAnimal terrestrialObj;
    
    public TerrestrialAnimalTest() {
        this.terrestrialObj = new TerrestrialAnimal(1,"Zebra","Anurag");
    }

    /**
     * Test of getWatchTime method, of class TerrestrialAnimal.
     */
    @Test
    public void testGetWatchTime() {
    }

    /**
     * Test of setWatchTime method, of class TerrestrialAnimal.
     */
    @Test
    public void testSetWatchTime() {
    }

    /**
     * Test of getAnimalName method, of class TerrestrialAnimal.
     */
    @Test
    public void testGetAnimalName() {
    }

    /**
     * Test of setAnimalName method, of class TerrestrialAnimal.
     */
    @Test
    public void testSetAnimalName() {
    }

    /**
     * Test of speak method, of class TerrestrialAnimal.
     */
    @Test
    public void testSpeak() {
        String expected = "Generic speak method";
        String actual = terrestrialObj.speak();
        assertEquals(expected,actual);
    }

    /**
     * Test of move method, of class TerrestrialAnimal.
     */
    @Test
    public void testMove() {
        String expected = "Generic move method";
        String actual = terrestrialObj.move();
        assertEquals(expected,actual);
    }
    
}
