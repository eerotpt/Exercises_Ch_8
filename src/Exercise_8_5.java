/**
 * Created by eero on 12/6/16.
 */
public class Exercise_8_5 {

    public static boolean[] sieve(int n){
        boolean[] indexOfPrimes= new boolean[n];
        //starting from index[2] writing true to all indexOfPrimes array values.
        for (int a=2;a<n;a++){
            indexOfPrimes[a]=true;
        }

//Sieve of Eratosthenes algorithm for finding prime numbers.
        for (int i=2;i<n;i++){
            for (int s=i;s+i<n;s=s+i){
                indexOfPrimes[s+i]=false;
            }
        }
        return indexOfPrimes;
    }

    //Checking the method sieve.
    public static void main(String[] args){
        int n=100;
        boolean[] indexOfPrimes=sieve(n);
        for (int i=0;i<n;i++)
            System.out.println(i+" "+indexOfPrimes[i]);
    }
}
