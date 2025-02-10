package DSA.o1_MethodORFunction.PrimeOrNot;

public class primenumber {
    public static boolean isprime(int n)
    {
         if(n==1 || n<1)
           return false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isprime(8));
    }
}
