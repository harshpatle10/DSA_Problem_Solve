package DSA.o1_MethodORFunction.PrimeOrNot;

import java.util.ArrayList;
import java.util.List;

public class Nprimenumber {

    public static List<Integer> nprime(int n)
    {
        List <Integer> primenumber = new ArrayList<>();
        List <Integer> notprimenumber = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
        int k;
            for( k=2;k<i;k++)
            {
                if(i%k==0) {
                    notprimenumber.add(i);
                    break;
                }
            }
            if(i==k){
                primenumber.add(i);
            }
        }
        System.out.println("not prime num : "+notprimenumber.size());
        System.out.println(" prime num : "+primenumber.size());

        return notprimenumber;
    }
    public static void main(String[] args) {
        System.out.println(nprime(100));


    }
}
