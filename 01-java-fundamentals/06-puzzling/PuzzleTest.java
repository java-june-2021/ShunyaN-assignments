public class PuzzleTest{

public static void main (String[] args){
    // ArrayList<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(5);
    // numbers.add(4);
    // numbers.add(3);
    // numbers.add(2);
    // numbers.add(1);
    Puzzle numbers = new Puzzle();
    
    int [] arr = {3,5,1,2,7,9,8,13,25,32};


    
    // System.out.println(numbers.sumOfAllNum());
    numbers.sumOfAllNum(arr);
    System.out.println(numbers.greaterThanTen(arr));
    System.out.println(numbers.shuffleNames());
    numbers.Alphabet();
    System.out.println(numbers.randomArr());
    numbers.randomSort();
    System.out.println(numbers.randomStr());
    // Collections.shuffle(numbers);
    // System.out.println(numbers); // [1, 5, 2, 4, 3]
    // Collections.sort(numbers);
    // System.out.println(numbers); // [1, 2, 3, 4, 5]
            
    // Random r = new Random();
    // System.out.println(r.nextInt()); // without bounds
    // System.out.println(r.nextInt(5)); // with bounds 0 to 5

    }
}