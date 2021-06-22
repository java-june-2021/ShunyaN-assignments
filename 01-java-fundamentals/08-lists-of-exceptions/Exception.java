import java.util.ArrayList;
import java.util.Random;
public class Exception {
    public static void main(String[] args){
        ArrayList<Object> excp = new ArrayList<Object>();
        excp.add("13");
        excp.add("Hello World");
        excp.add(48);
        excp.add("Goodbye World");
        for(int i = 0; i < excp.size(); i++){
            // Integer castedValue = (Integer) excp.get(i);
            try {
                Integer castedValue = (Integer) excp.get(i);
                System.out.println(castedValue);
            } catch(ClassCastException e) {
                System.out.println(excp.get(i));
            }
        }
    }
}