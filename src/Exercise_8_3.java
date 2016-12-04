/**
 * Created by eero on 04/12/2016.
 */
/**Exercise 8.3 What is the output of the following program? Draw a stack
 *diagram that shows the state of the program just before mus returns. Describe
 *in a few words what mus does.
 *ANSWER: Stack diagram:
 *                       bob={2,4,6,8,10}
 *                       fus=2+4+6+8+10
 *   mus adds the values in an array bob
 */
public class Exercise_8_3 {

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }
    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }
    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}
