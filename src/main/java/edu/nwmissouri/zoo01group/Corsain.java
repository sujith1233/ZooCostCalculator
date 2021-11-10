/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * Corsain class inheriting from the boat
 *
 * @author Pandiri Govinda Reddy
 *
 */
public class Corsain extends Boat {

    private String color;
    private String serialNumber;
    private String coDriver;

    /**
     *
     * @return coDriver
     */
    public String getCoDriver() {
        return coDriver;
    }

    /**
     *
     * @param coDriver
     */
    public void setCoDriver(String coDriver) {
        this.coDriver = coDriver;
    }

    /**
     * getter and setter to get color and cost
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return serialNumber
     */
    public String getserialNumber() {
        return serialNumber;
    }

    /**
     *
     * @param serialNumber
     */
    public void setserialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Method returns the vehicle number
     *
     * @return serialNumber
     */
    public String vehicileNumber() {
        return this.serialNumber;
    }

    /**
     * Method returns the color of the vehicle
     *
     * @return color
     */
    public String vehicleColor() {
        return this.color;
    }
}
