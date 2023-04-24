package Zadatak02_Polimorf;

public class Tiger extends Animal{

    @Override
    public void produceSomeSound(){
        super.produceSomeSound();
        System.out.println(getClass().getSimpleName() + "Roar roar roar");
    }

    public void huntPray(){
        System.out.println("Hunting pray");
    }
}
