/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * Class Boat inheriting from the Vehicle

 * @author Pandiri Govinda Reddy 
 */
public class Boat extends Vehicle {

    private double maxSpeed_mileperhour;
    private int capacity;
    private double perHourPrice_dollars;

    /**
     * getter method to get max speed
     *
     * @return maxSpeed_miles per hour
     */
    public double getmaxSpeed_mileperhour() {
        return maxSpeed_mileperhour;
    }

    /**
     * setter method is for max speed of the boat
     *
     * @param maxSpeed_mileperhour
     */
    public void setmaxSpeed_mileperhour(double maxSpeed_mileperhour) {
        this.maxSpeed_mileperhour = maxSpeed_mileperhour;
    }
    /**
     * getter method to get capacity of the sets
     *
     * @return capacity
     */

    public int getCapacity() {
        return capacity;
    }
    /**
     * setter method is for capacity of the boat
     *
     * @param capacity
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    /**
     *
     * @return perHourPrice_dollars
     */
    public double getperHourPrice_dollars() {
        return perHourPrice_dollars;
    }
    /**
     *
     * @param perHourPrice_dollars
     */
    public void setperHourPrice_dollars(double perHourPrice_dollars) {
        this.perHourPrice_dollars = perHourPrice_dollars;
    }
    /**
     * Method returns the capacity of the boat
     *
     * @return capacity
     */
    public int boatSeating() {
        return this.capacity;
    }
    /**
     * Method returns the max speed of the boat per hours
     *
     * @return maxSpeed_mileperhour
     */
    public double milesPerHour() {
        return this.maxSpeed_mileperhour;
    }

}
