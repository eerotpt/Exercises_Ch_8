/**
 * Created by eero on 12/5/16.
 */
public class Exercise_8_6 {

    /**
     * Exercise 8.6 Write a method named areFactors that takes an integer n
     and an array of integers, and that returns true if the numbers in the array
     are all factors of n (which is to say that n is divisible by all of them).
     */
    public static boolean areFactors(int n,int[]a){
        for(int value:a){
            if (n % value !=0){
                return false;
            }
        }return true;
    }
    //checking the outcome of method areFactors
    public static void main(String[] args){
        int[] array={2,4,6,8,1};
        System.out.print(areFactors(24,array));
    }
}

