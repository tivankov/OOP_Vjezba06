package Zadatak02_Polimorf;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SmartTV smart = new SmartTV();
        smart.poerOnDevice(2);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new Tiger());
        animals.add(new RubberAnimal());
        producingAimalSounds(animals);
        Tiger tiger = new Tiger();
        tiger.huntPray();
    }
    private static void producingAimalSounds(ArrayList<Animal> animals){
        for (Animal animal: animals){
            animal.produceSomeSound();
        }
    }
}
