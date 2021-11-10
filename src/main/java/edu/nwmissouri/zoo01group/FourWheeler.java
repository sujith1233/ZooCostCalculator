/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This is a four wheeler class extended from Vehicle Class
 * @author Mulamalla,Akhil Kumar Reddy 
 */
public class FourWheeler extends Vehicle {
    private String vehicleName;
    private String vehicleColor;
    private int vehicleYear;
    private String vehicleOwner;
    /**
     *
     */
    public FourWheeler() {}


    /**
     *getter method to get vehicle name
     * @return vehicleName//name of the brand which the car is
     */
    public String getVehicleName() {
        return vehicleName;
    }/**
     * 
     * @return vehicleOwner
     */

    public String getVehicleOwner() {
        return vehicleOwner;
    }/**
     * 
     * @param vehicleOwner 
     */

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    /**
     *setter method to set vehicleName
     * @param vehicleName//name of the brand which the car is
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     *getter method to get vehicleColor
     * @return vehicleColor
     */
    public String getVehicleColor() {
        return vehicleColor;
    }

    /**
     * setter method to set vehicleColor
     * @param vehicleColor
     */
    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    /**
     *getter method to get vehicleYear
     * @return vehicleYear
     */
    public int getVehicleYear() {
        return vehicleYear;
    }

    /**
     * setter method to set vehicleYear
     * @param vehicleYear
     */
    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    /**
     * Boolean method to check vehicleWorkingState
     * @param vehicleName
     * @return vehicleWorkingState
     */
    public boolean vehicleWorkingState(String vehicleName) {
        return false;
    }

    /**
     * vehicleOwner method to get owner name
     * @param vehicleName
     * @return string 
     */
    public String vehicleOwner(String vehicleName) {
        return vehicleOwner;
    }
}
