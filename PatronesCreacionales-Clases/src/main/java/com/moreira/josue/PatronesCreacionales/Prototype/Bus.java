package com.moreira.josue.PatronesCreacionales.Prototype;

public class Bus extends Vehicle{
    private int passengerNumbers;

    public Bus(){

    }

    public Bus(int passengerNumbers, String brand, String model, String color){
        super(brand, model, color);
        this.passengerNumbers = passengerNumbers;
    }

    public int getPassengerNumbers() {
        return passengerNumbers;
    }

    public void setPassengerNumbers(int passengerNumbers) {
        this.passengerNumbers = passengerNumbers;
    }


    @Override
    public String toString() {
        return "Bus{" +
                "passengerNumbers=" + passengerNumbers +
                '}';
    }

    public Bus clone(){
        Bus clon = new Bus();
        clon.setPassengerNumbers(this.passengerNumbers);
        clon.setBrand(getBrand());
        clon.setModel(getModel());
        clon.setColor(getColor());
        return clon;
    }
}
