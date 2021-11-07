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
    private boolean isSafe;

    public TerrestrialAnimal(String name){
         super(name);
    }
    /**
     *
     * @param distance
     * @param weight
     * @param safe
     * @param name
     */
    public TerrestrialAnimal(int distance, double weight, boolean isSafe, String name) {
        super(name);
        this.distance = distance;
        this.weight = weight;
        this.isSafe = isSafe;
    }
    
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
        return isSafe;
    }

    /**
     *
     * @param safe
     */
    public void setIsSafe(boolean safe) {
        this.isSafe = safe;
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
