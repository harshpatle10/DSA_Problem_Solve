package DSA.o1_MethodORFunction.FunctionAssignment;


public class PalindromsNUM {

    public boolean paling(int n)
    {
        int p=n;
        int sum=0;
        while(n>0)
        {
            int rem = n%10;
            sum = rem+ (10*sum);
            n = n/10;
        }
        System.out.println(sum + " "+ p);
        if(p==sum)
            return true;
        return false;
    }

}
class  palingdriver{
    public static void main(String[] args) {
        PalindromsNUM p = new PalindromsNUM();
        System.out.println("palingdrome num OR not ??? ");
        System.out.println(p.paling(121));
    }
}
