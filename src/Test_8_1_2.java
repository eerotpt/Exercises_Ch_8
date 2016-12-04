/**
 * Created by eero on 04/12/2016.
 */
public class Test_8_1_2 {


    public static int[] histGram_1(int[]scores,int n){
        int[] counts = new int[n];
        for (int score:scores) {
            counts[score]++;
        }return counts;
    }

    public static void main(String[] args){
        int[]array={1,30,7,0};
        int[]histogram=histGram_1(array,31);
        for (int num:histogram) {
            System.out.print(num+" ");
        }

    }
}
