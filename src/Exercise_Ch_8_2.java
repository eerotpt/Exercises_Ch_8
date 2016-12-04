/**
 * Created by eero on 04/12/2016.
 */

/**For each method, write one sentence that describes what the method does,
 * without getting into the details of how it works. For each variable, identify
 the role it plays.
 */
public class Exercise_Ch_8_2 {
//method banana is multiplying all the values of an array .
    public static int banana(int[] a) {
        int kiwi = 1; //kiwi is the sum of multiplication
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
//method grapefruit is searching trough an array
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {//grape is the searched value
                return i;
            }
        }
        return -1;
    }
//counting how many times is a value in an array
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {//pine is one value from an array
            if (pine == apple) {//apple is searced value
                pear++;
            }
        }
        return pear;//pear is the count of searced value in an array
    }
}
