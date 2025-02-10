package DSA.o1_MethodORFunction.FunctionAssignment;

public class DigitSum {

    public int digit(int n)
    {
        int sum=0;
        while (n>0)
        {
            int rem = n%10;
            sum = sum+ rem;
            n = n/10;
        }
        return sum;
    }
}
class digitdriver{
    public static void main(String[] args) {
        DigitSum ds = new DigitSum();
        System.out.println(ds.digit(65));;
    }
}
