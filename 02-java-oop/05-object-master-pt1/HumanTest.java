public class HumanTest{
    public static void main(String[] args){

        Human adam = new Human();
        Human eve = new Human();

        adam.getHealth();
        eve.getHealth();
        adam.getStrenth();
        eve.getIntelligence();
        adam.attack(eve);
        eve.getHealth();
        eve.attack(adam);
        adam.getHealth();
    }
}