/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Sujith Reddy Naidu
 */
public class Motorbike extends Animal{
       
    private double maxSpeed;
    private VehicleCategories vehicleType;
    private double pricePerHour_dollars;

    public Motorbike(String name) {
        super(name);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public VehicleCategories getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleCategories vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPricePerHour_dollars() {
        return pricePerHour_dollars;
    }

    public void setPricePerHour_dollars(double pricePerHour_dollars) {
        this.pricePerHour_dollars = pricePerHour_dollars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalGender getGender() {
        return gender;
    }

 
    public void setGender(AnimalGender gender) {
        this.gender = gender;
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
    

}
