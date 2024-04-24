package com.moreira.josue.PatronesCreacionales.Prototype;

public class Vehicle implements VehicleInterface{
    private String brand;
    private String model;
    private String color;

    public Vehicle(){

    }

    public Vehicle(String brand, String model, String color) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public VehicleInterface clone(){
        return new Vehicle(brand, model, color);
    }
}
