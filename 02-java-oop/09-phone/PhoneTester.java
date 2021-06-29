public class PhoneTester {
    public static void main(String[] args){
        Galaxy s9 = new Galaxy("s9", 99, "Verizon","Wheeeez Wheeeez!");
        IPhone x11 = new IPhone("iPhone 11 Pro-Max", 100, "AT&T", "Buzzzz");

        s9.displayInfo();

        x11.displayInfo();
    }
}