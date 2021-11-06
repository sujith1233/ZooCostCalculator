/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Anurag Kolluru
 */
public class TerrestrialAnimal extends Animal {
    
    private int distance;
    private double weight;
    private boolean safe;

    /**
     *
     * @return
     */
    public int getDistance() {
        return distance;
    }

    /**
     *
     * @param distance
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return
     */
    public boolean isSafe() {
        return safe;
    }

    /**
     *
     * @param safe
     */
    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    /**
     *
     * @param distance
     * @param weight
     * @param safe
     * @param name
     */
    public TerrestrialAnimal(int distance, double weight, boolean safe, String name) {
        super(name);
        this.distance = distance;
        this.weight = weight;
        this.safe = safe;
    }
  
    /**
     *
     */
    @Override
    public void speak() {

    }

    /**
     *
     */
    @Override
    public void move() {
    }
    
    /**
     *
     * @return
     */
    public String travle(){
        return "trip";
    }
    
    /**
     *
     * @return
     */
    public int count(){
        return 100;
    }
    
    /**
     *
     * @return
     */
    public double length(){
        return 15.7;
    }
    

}
