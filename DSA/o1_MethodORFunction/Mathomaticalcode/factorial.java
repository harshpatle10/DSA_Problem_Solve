package DSA.o1_MethodORFunction.Mathomaticalcode;


public class factorial {
public static int fact (int n)
{
    int sum=1;
    for(int i=1;i<=n;i++)
    {
        sum =sum*i;
    }
    return sum;
}
public static int bincoeff(int n,int r)
{
    int cofee_n = fact(n);
    int cofee_r = fact(r);
    int cofee_nmr = fact(n-r);

    return  cofee_n / (cofee_r * cofee_nmr);
}
    public static void main(String[] args) {
        System.out.println(bincoeff(5,2));
    }
}
