public class Samurai extends Human {
    private static int samurai = 0;

    public Samurai(){
        health = 200;
        samurai++;
    }
    public void deathBlow(Human character){
        int strike = -(character.getHealth());
        character.setHealth(strike);
        health = (health/2);
        System.out.printf("The Death Blow hit for %d \n", strike);
    }

    public static int howMany(){
        return samurai;
    }

}