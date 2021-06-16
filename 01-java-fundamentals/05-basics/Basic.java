import java.util.ArrayList;
import java.util.Arrays;
public class Basic {
    public static void main(String[] args){
        Basic ans = new Basic();
        ans.print255();
        ans.printOdd255();
        ans.printSum();
        int [] arr = {-1, 2, 3, 4, 7};
        int [] array = {1,5,7,8,10,};
        int y = 3;
        ans.findMax(arr);
        ans.loopArray(arr);
        System.out.println(ans.getAvg(arr));
        System.out.println(ans.oddArray());
        System.out.println(ans.greaterThanY(arr, y));
        System.out.println(ans.squareArray(arr));
        System.out.println(ans.eliminateNegative(array));
        System.out.println(ans.maxMinAvg(array));
        System.out.println(ans.shiftValues(array));

    }


    public static void print255() {
        for (int i = 1; i<= 255; i++){
        System.out.println(i);
        }
    }
    public static void printOdd255() {
        for(int i = 1; i<= 255; i++){
            if (i % 2 == 1)
            System.out.println(i);
        }
    }
//     public static int printSum(int[] numbers) {
//         int sum = 0;
//         for(int i; i<= numbers.length; i++){
//             sum += numbers[i];
//         }
//         return sum;
//     }
    public static void printSum(){
        int sum = 0;
        for(int i = 0; i <= 255; i++) { 
        sum += 1;
        System.out.println(String.format("New number: %d, Sum: %d", i, sum));
        }
    }
    public void findMax(int[] arr){
        int max = arr[0];
        for(int val: arr){
            if(val > max)
                max = val;
        }
        System.out.println(max);
    }
    public static void loopArray(int[] arr){
        for (int val: arr)
        System.out.println(val);
    }
    public double getAvg(int[] arr){
        double sum = 0;
        for(int val: arr){
            sum += val;
        }
        double avg = sum/arr.length;
        return avg;
    }
    public ArrayList<Integer> oddArray(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 1; i <=255; i++){
            if(i % 2 == 1)
            nums.add(i);
        }
        return nums;
    }

    public int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int num: arr){
            if(num > y)
            count++;
        }
        return count;
    }
    public String squareArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        return Arrays.toString(arr);
    }
    public String eliminateNegative(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0)
            arr[i] = 0;
        }
        return Arrays.toString(arr);
    }
    public String maxMinAvg(int[]arr){
        double min = (double)arr[0];
        double max = (double)arr[0];
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        double avg = sum/arr.length;
        double[] result = {max, min, avg};
        return Arrays.toString(result);
    }
    public String shiftValues(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr [i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        return Arrays.toString(arr);
    }
}