public class Wizard extends Human {

    public Wizard(){
        health = 50;
        intelligence = 8;
    }
    public void heal(Human character){
        System.out.println(String.format("character is healed by %d", getIntelligence()));
        character.setHealth(getIntelligence());
    }

    public void fireball(Human character){
        int damage = -(getIntelligence() * 3);
        System.out.println(String.format("character is hit by %d\n", damage));
        character.setHealth(damage);
    }

}