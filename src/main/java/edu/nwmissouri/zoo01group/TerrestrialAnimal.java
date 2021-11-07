/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This class gives information about Terrestrial animals (dog,cat,goat)
 *
 * @author Anurag Kolluru
 */
public class TerrestrialAnimal extends Animal {

    private int watchTime;
    private String animalName;

    /**
     * This is a constructor
     *
     * @param watchTime
     * @param animalName
     * @param name
     */
    public TerrestrialAnimal(int watchTime, String animalName, String name) {
        super(name);
        this.watchTime = watchTime;
        this.animalName = animalName;
    }

    /**
     * This method returns the Watch time
     *
     * @return
     */
    public int getWatchTime() {
        return watchTime;
    }

    /**
     * This method sets the Watch time
     *
     * @param watchTime
     */
    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }

    /**
     * THis method returns the Animal name
     *
     * @return
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * This method sets the Animal name
     *
     * @param animalName
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     *
     */
    @Override
    public void speak() {
        System.out.println("Generic speak method");
    }

    /**
     *
     * @param animalName
     * @param name
     */
    public TerrestrialAnimal(String animalName, String name) {
        super(name);
        this.animalName = animalName;
    }

    /**
     * This is a constructor
     *
     * @param name
     */
    public TerrestrialAnimal(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    public void move() {
        System.out.println("Generic move method");

    }

}
