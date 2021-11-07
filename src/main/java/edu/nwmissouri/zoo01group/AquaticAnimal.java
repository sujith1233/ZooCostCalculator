/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This class gives information about Aquatic animal (fish,frog,whale)
 *
 * @author Anurag Kolluru
 */
public class AquaticAnimal extends Animal {

    /**
     *
     */
    public double distance;
    public boolean isDangerous;
    private double waterDepth_meters;
    private int watchTime;

    /**
     *
     */
    @Override
    public void speak() {
        System.out.println("Generic speak method");

    }

    /**
     *
     */
    @Override
    public void move() {
        System.out.println("Generic move method");
    }

    /**
     * This is a constructor
     * @param distance
     * @param isDangerous
     * @param waterDepth_meters
     * @param watchTime
     * @param name
     */
    public AquaticAnimal(double distance, boolean isDangerous, double waterDepth_meters, int watchTime, String name) {
        super(name);
        this.distance = distance;
        this.isDangerous = isDangerous;
        this.waterDepth_meters = waterDepth_meters;
        this.watchTime = watchTime;
    }

    /**
     * This method returns depth of the water
     *
     * @return
     */
    public double getWaterDepth_meters() {
        return waterDepth_meters;
    }

    /**
     * This method returns the watch time
     *
     * @return
     */
    public int getWatchTime() {
        return watchTime;
    }

    /**
     * This method sets the depth of the water
     *
     * @param waterDepth_meters
     */
    public void setWaterDepth_meters(double waterDepth_meters) {
        this.waterDepth_meters = waterDepth_meters;
    }

    /**
     * This method sets the watch time
     *
     * @param watchTime
     */
    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }

}
