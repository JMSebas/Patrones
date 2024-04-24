package com.moreira.josue.PatronesCreacionales.Prototype;

import java.util.Hashtable;

public class VehicleRegister {
    private final Hashtable<String, VehicleInterface> prototypes = new Hashtable<>();

    public void addVehicle(String key,VehicleInterface vehicle){
        prototypes.put(key, vehicle);
    }
    public VehicleInterface getVehicle (String key){
        return prototypes.get(key);
    }
}
