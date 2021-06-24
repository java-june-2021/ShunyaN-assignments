public class Human {

    int strength, stealth, intelligence, health;

    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    // get Methods
    public int getStrenth(){
        System.out.println(String.format("Strength is: %d", this.strength));
        return strength;
    }

    public int getStealth(){
        System.out.println(String.format("Stealth is: %d", this.stealth));
        return stealth;
    }

    public int getIntelligence(){
        System.out.println(String.format("Intelligence is: %d", this.intelligence));
        return intelligence;
    }

    public int getHealth(){
        System.out.println(String.format("Health is: %d", this.health));
        return health;
    }
    
    //setters
    public void setStrength(int strength){
        this.strength = strength;
    }
    
    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public void setIntelligene(int intelligence){
        this.intelligence = intelligence;
    }

    public void setHealth(int health){
        this.health = health;
    }

    //attacking

    public void attack(Human character){
        character.health = (character.health - getStrenth());
    }
}