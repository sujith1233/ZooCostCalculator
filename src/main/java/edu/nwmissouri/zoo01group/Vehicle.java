/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This is Vehicle Abstract class
 * @author Mulamalla,Akhil Kumar Reddy 
 */
public abstract class Vehicle 
{
    private double speed;
    private double kilometers;
    private String name;
    
    /**
     * getter method to get mileage
     * @return mileage//This method returns the mileage of the car
     */
    public double getMileage(){
        double mileage=(speed/kilometers)*5/18;
    return mileage;
}

    /**
     * getter method to get max Speed
     * @return maxSpeed /This method returns the high speed of the car
     */
    public double getMaxSpeed(){
        double maxSpeed=speed*100;
    return maxSpeed;
}
    
}