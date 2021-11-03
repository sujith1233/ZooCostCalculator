/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This is Animal abstract class
 *
 * @author Sreebharath Mallampati
 */
public abstract class Animal {

    //for name
    protected final String name;

    /**
     * This is Animal constructor
     *
     * @author Sreebharath Mallampati
     * @param name
     */
    Animal(String name) {
        this.name = name;
    }

    /**
     * This is a speak method
     *
     * @author Sreebharath Mallampati
     */
    public void speak() {
        System.out.println("Generic animal sound");
    }

    /**
     * This is a move method which gives the moving nature.
     *
     * @author Sreebharath Mallampati
     */
    public void move() {
        System.out.println("Generic animal movement");
    }
}
