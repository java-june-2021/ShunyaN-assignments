public class Gorilla extends Mammal{

    public Gorilla(){
        setEnergyLevel(100);
    }

    public void throwSomething(){
        System.out.println("Throws banana at me!");
        setEnergyLevel(-5);
    }

    public void eatBananas(){
        System.out.println("BANANA POGGERS");
        setEnergyLevel(10);
    }

    public void climb(){
        System.out.println("Climbed Rock like a Star");
        setEnergyLevel(-10);
    }
}