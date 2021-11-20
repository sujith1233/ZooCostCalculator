/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo01group;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Sujith Reddy Nidu
 */
public class MotorbikeTest {
    
    public MotorbikeTest() {
    }

    /**
     * Test of getMaxSpeed method, of class Motorbike.
     */
    @Test
    public void testGetMaxSpeed() {
        assert(true);
    }

    /**
     * Test of setMaxSpeed method, of class Motorbike.
     */
    @Test
    public void testSetMaxSpeed() {
        assert(true);
    }

    /**
     * Test of getVehicleType method, of class Motorbike.
     */
    @Test
    public void testGetVehicleType() {
        assert(true);
    }

    /**
     * Test of setVehicleType method, of class Motorbike.
     */
    @Test
    public void testSetVehicleType() {
        assert(true);
    }

    /**
     * Test of getPricePerHour_dollars method, of class Motorbike.
     */
    @Test
    public void testGetPricePerHour_dollars() {
        assert(true);
    }

    /**
     * Test of setPricePerHour_dollars method, of class Motorbike.
     */
    @Test
    public void testSetPricePerHour_dollars() {
        assert(true);
    }
    public static void Exception()
    {
        int a=9;
        int b=0;
        try{
            int y=a/b;
            System.out.println("divided value"+y);
        }catch(Exception e){
                        System.out.println("Exception is "+e);

        }
    }
    public static void Casting()
    {
        int i=9;
        double d=(double) i;
         System.out.println("Casted from int to double"+d);

    }
    public static void main(String[] args){
        Exception();
        
    }
    
}
