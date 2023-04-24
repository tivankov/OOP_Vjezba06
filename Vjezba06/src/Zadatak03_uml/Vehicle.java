package Zadatak03_uml;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int years;
    private int id;
    private static int cntID = 100;
    private static final int MINYR = 1;
    private static final int MAXYR = 30;
    private static final String CP = "ZD -";

    private String carPlate;
    public Vehicle(String maufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        this.years = ThreadLocalRandom.current().nextInt(MAXYR, MAXYR);
        this.id = cntID++;
        this.carPlate = "{ " + CP + id + " }";

    }

    public void driveVehice(){
        System.out.println("Drividn vehice with car plate: " + carPlate);
    }

    public String getCarPlate() {
        return carPlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carPlate='" + carPlate + '\'' +
                '}';
    }
}
