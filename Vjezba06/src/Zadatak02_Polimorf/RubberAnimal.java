package Zadatak02_Polimorf;

public class RubberAnimal extends Animal{
    @Override
    public void produceSomeSound() {
        super.produceSomeSound();
        System.out.println(getClass().getSimpleName() + " ");
    }
}
