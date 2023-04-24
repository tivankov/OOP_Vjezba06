package Zadatak03_uml;

import java.util.ArrayList;

public class FleetVehicles {

    private ArrayList<Vehicle> vehicles;
    public FleetVehicles(){
        vehicles = new ArrayList<>();
    }

    public void addVehicelToFleet(Vehicle vehicle){
        if (vehicles.contains(vehicle)){
            System.out.println("Vehicle with car plate: " + vehicle.getCarPlate() + " already in fleet!!!");
        }else {
            vehicles.add(vehicle);
            System.out.println("Vehicle " + vehicle.getCarPlate() + " added to fleet!");
        }
    }
    public Vehicle removeVehcelFromFleet(Vehicle velice){
        Vehicle veh = null;
        if (vehicles.contains(velice)){
            veh = velice;
            vehicles.remove(velice);
            System.out.println(veh.getCarPlate() + " removed from freet!");
        }else {
            System.out.println("Vehicle is not in the fleet - nothing to remove!");
        }

        return veh;
    }

    public void listAllVehiclesInFleet(){
        for (Vehicle veh : vehicles){
            System.out.println(veh);
        }
    }

}
