/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Pandiri Govinda Reddy
 */
public class Corsain extends Boat {
    private double length;
    private double cost;
  /**
   * getter and setter to get length and cost
   * return length
    
    */
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Corsain() {
       
    }
     
    
    public double size(){
        return this.length;
    }
    /**
     * Method used to calculate the cost
    */
    public double costPerMile(){
        return this.cost;
    }
}
