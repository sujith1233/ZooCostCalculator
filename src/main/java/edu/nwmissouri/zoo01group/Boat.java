/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Pandiri Govinda Reddy
 */
public class Boat extends Vehicle{
    private int speed;
    private String company;
    private double length;
    /**
     * getter method to get speed 
     * @return speed
     
    
    */
    public int getSpeed() {
        return speed;
    }
    /**
     * setter method to get speed
     * @return speed
    */

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     *getter method to get company 
     * @ return company
    */

    public String getCompany() {
        return company;
    }
    /**
     * setter method to get company
     * @return company
    */

    public void setCompany(String company) {
        this.company = company;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    /**
     * Method used to display company of boat
   
    */
    public String boatMake(){
        return this.company;
    }
    /**
     *  Method used to show speed of the boat 
    */
    public double milesPerHours(){
        return this.speed;
    }
    
}

