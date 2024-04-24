package com.moreira.josue.PatronesCreacionales.Prototype;

public class Taxi extends Vehicle{
    private int doorNumbers;

    public Taxi(){
        super();
    }

    public Taxi(int doorNumbers, String brand, String model, String color){
        super(brand, model, color);
        this.doorNumbers = doorNumbers;
    }

    public int getDoorNumbers() {
        return doorNumbers;
    }

    public void setDoorNumbers(int doorNumbers) {
        this.doorNumbers = doorNumbers;
    }


    @Override
    public String toString() {
        return this.getBrand() + " " + this.getModel() + " " + this.getColor() + " " + this.getDoorNumbers();
    }



    public Taxi clone(){
        Taxi clon = new Taxi();
        clon.setDoorNumbers(this.doorNumbers);
        clon.setBrand(getBrand());
        clon.setModel(getModel());
        clon.setColor(getColor());
        return clon;
    }
}
