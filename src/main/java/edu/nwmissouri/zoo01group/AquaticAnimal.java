/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Anurag Kolluru
 * 
 */
public class AquaticAnimal extends Animal{
    
    private double depth;
    private String name;
    private boolean amphibians;

    /**
     *
     */
    @Override
    public void speak() {
      
    }

    /**
     *
     * @param depth
     * @param amphibians
     * @param name
     */
    public AquaticAnimal(double depth, boolean amphibians, String name) {
        
        this.depth = depth;
        this.name = name;
        this.amphibians = amphibians;
    }

    /**
     *
     * @return
     */
    public double getDepth() {
        return depth;
    }

    /**
     *
     * @param depth
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public boolean isAmphibians() {
        return amphibians;
    }

    /**
     *
     * @param amphibians
     */
    public void setAmphibians(boolean amphibians) {
        this.amphibians = amphibians;
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
    public String swim() {
        return "yes";
    }
    
    /**
     *
     * @return
     */
    public int speed(){
        return 30;
    }
    
    /**
     *
     * @return
     */
    public boolean scubaDiving() {
        return true;
    }
}
