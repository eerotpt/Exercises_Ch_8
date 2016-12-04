/**
 * Created by eero on 04/12/2016.
 */
public class Exercise_8_4 {
    /**
     * Write a method called indexOfMax that takes an array of
     integers and returns the index of the largest element. Can you write this
     method using an enhanced for loop? Why or why not?
     *
     * ANSWER:Can not write this method using enhanced for loop,
     * because it does not reveal index of an array element,
     * what is needed
     */

    public static int indexOfMax(int[]a) {
        int index=0;
        int max=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
                 index=i;
            }
        }
        return index;
    }
//checking outcome of method indexOfMax
    public static void main(String[] args){
        int[]array={1,33,55,4,5,7};
        System.out.println(indexOfMax(array));
    }
}