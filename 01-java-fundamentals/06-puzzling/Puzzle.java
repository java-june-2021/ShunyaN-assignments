import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Puzzle {
    public static void sumOfAllNum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
        sum = sum + arr[i];
        }
        System.out.println("Sum of all the Numbers:" + sum);
    }

    public ArrayList<Integer> greaterThanTen(int[] arr){
        // int[] arr = {3,5,1,2,7,9,8,13,25,32};
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
            for(int i: arr){
                if(i > 10){
                    arrList.add(i);
            }
        }
        return arrList;
    }

    public ArrayList<String> shuffleNames(){
        ArrayList<String> name = new ArrayList<String>();

        name.add("Nancy");
        name.add("Jinichi");
        name.add("Fujibayashi");
        name.add("Momochi");
        name.add("Ishikawa");

        Collections.shuffle(name);
        System.out.println(name);
        System.out.println();
        // for (int x = 0; x < nameArray.size(); x++){
        //     name.add(nameArray.get(x));
        //     Collections.shuffle(name);
        // }
        ArrayList<String> nameList = new ArrayList<String>();
        for (String str : name){
            if(str.length() > 5){
                nameList.add(str);
            }
        }
        return nameList;
    }
    public void Alphabet(){
        ArrayList<String> alph = new ArrayList<String>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            alph.add(Character.toString(a));
            a++;
        }
        Collections.shuffle(alph);
        System.out.println(alph.get(alph.size() - 1));
        if(alph.get(0).equals("a") || alph.get(0).equals("e")|| alph.get(0).equals("i")|| alph.get(0).equals("o")|| alph.get(0).equals("u")){
            System.out.println("First Letter is a vowel" + alph);
        }
    }
    // public void randomNum(){
    //     randomNum rand = new randomNum();

    //     int rand_int1 = rand.nextInt(55);
    //     int rand_int2 = rand.nextInt(100);

    //     System.out.println("Random Integers: "+rand_int1);
    //     System.out.println("Random Integers: "+rand_int2);
    // }
    public ArrayList<Integer> randomArr(){
        ArrayList<Integer> randList = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            Integer rand = r.nextInt(100 - 55) + 45;
            randList.add(rand);
        }
        return randList;
    }
    public void randomSort(){
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        Random r = new Random();
        int max = -100000000;
        int min = 100000000;
        for(int i = 0; i < 10; i++){
            Integer rand = r.nextInt(100-55) + 55;
            sortList.add(rand);
        }
        Collections.sort(sortList);
        System.out.println(sortList);
        for(Integer i : sortList){
            if(Integer.compare(i,max) > 0){
                max = i;
            }
            if(Integer.compare(i,min)< 0){
                min = i;
            }
        }
        System.out.println("Minimum is: " + Integer.toString(min));
        System.out.println("Maximum is: " + Integer.toString(max));
    }
    public String randomStr(){
        ArrayList<String> str = new ArrayList<String>();
        char a = 'a';
        for(int i = 0; i <26; i++){
            str.add(Character.toString(a));
            a++;
        }
        String rdmstr = "";
        for(int i = 0; i < 5; i++){
            Collections.shuffle(str);
            rdmstr += str.get(0);
        }
        return rdmstr;
    }
}