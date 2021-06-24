// The bat should be tested by attacking three towns, eating two humans, 
// flying twice, and then displaying its energy. Use the display energy from the superclass!
public class Bat extends Mammal {
    public Bat(){
        setEnergyLevel(300);
    }

    public void fly(){
        System.out.println("SWISH SWISH WHIZZ WHIZZ");
        setEnergyLevel(-50);
    }

    public void eatHumans(){
        setEnergyLevel(25);
    }

    public void attackTown(){
        System.out.println("KAN KAN KAN KAN, WEEE-OWWW-WEE-OWWW");
        setEnergyLevel(-100);
    }
}