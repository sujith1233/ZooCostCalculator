/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

public class AquaticAnimal {

    private double depth;
    private String name;



    /**
     *
     * @param depth
     * @param name
     */
    public AquaticAnimal(double depth, String name) {
        this.depth = depth;
        this.name = name;
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
    public String swim() {
        return "yes";
    }

    /**
     *
     * @return
     */
    public int speed() {
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
