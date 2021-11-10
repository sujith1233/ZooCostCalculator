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
     *getter method to get co-driver
     * @return coDriver
     */
    public String getCoDriver() {
        return coDriver;
    }

    public Corsain(String color, String serialNumber){
        this.color = color;
        this.serialNumber = serialNumber;
    }
    
      public Corsain(){
        
    }
    
    
    /**
     *setter method to set co-driver
     * @param coDriver
     */
    public void setCoDriver(String coDriver) {
        this.coDriver = coDriver;
    }

    /**
     * getter method to get color
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     *setter method to set color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *getter method to get serial number
     * @return serialNumber
     */
    public String getserialNumber() {
        return serialNumber;
    }

    /**
     *setter method to set serial number
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
    public String vehicleNumber() {
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
