public class Ninja extends Human {

    public Ninja(){
        stealth = 10;
    }
    public void runAway(Human character){
        int steal = -10;
        System.out.println("Ninja steals 10 Health and runs away!");
        character.setHealth(steal);
    }
}