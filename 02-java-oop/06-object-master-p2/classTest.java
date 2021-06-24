public class classTest {
    public static void main(String[] args){
        Ninja shadow = new Ninja();
        Wizard mage = new Wizard();
        Samurai kenshi = new Samurai();
        Samurai sugoi = new Samurai();

        shadow.runAway(kenshi);
        mage.fireball(kenshi);
        kenshi.deathBlow(mage);
        System.out.println(mage.getHealth());
        System.out.println(Samurai.howMany());
    }
}