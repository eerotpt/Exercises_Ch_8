/**
 * Created by eero on 03/12/2016.
 */
public class Exercise_Ch_8_1 {

/**1. Starting with the code in Section 8.6, write a method called powArray
 that takes a double array, a, and returns a new array that contains the
 elements of a squared. Generalize it to take a second argument and raise
 the elements of a to the given power.
 */
    public static double[] powArray(double[]a,double n) {
        double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++)
            result[i] = Math.pow(a[i], n);
    return result;
    }
    //Checking result of method powArray:
    public static void main(String[] args){
        double[]array={1,2,3,4,5,6,7};
        double[]printoutanswer=powArray(array,3);
        System.out.print("{"+printoutanswer[0]);
        for (int i = 1; i < printoutanswer.length; i++) {
            System.out.print(", " + printoutanswer[i]);
        }
        System.out.println("}");
    }
    /**2. Starting with the code in Section 8.10, write a method called histogram
    that takes an int array of scores from 0 to (but not including) 100, and
    returns a histogram of 100 counters. Generalize it to take the number of
    counters as an argument.
     */
    public static int[] histogram(int[]scores,int n){
        int[] counts = new int[n];
        for (int score:scores) {
            counts[score]++;
        }return counts;
    }
}
