package DSA.o1_MethodORFunction.ConvertionBInaryDecimal;

import java.util.Scanner;

class DecimalTobinary {
    private  int num ;
     public  DecimalTobinary(int n)
    {
        this.num = n;
    }
    public  int decimalTo()
    {
        int sum = 0;
        int power=0;
        while (num>0)
        {
           int rem = num%2;
           sum = sum + (rem*(int)Math.pow(10,power));
           num = num/2;
           power++;
        }

        return sum;
    }

}
class driverbinary{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        DecimalTobinary d  = new DecimalTobinary(n);
        System.out.println("Decial to Binary reverse "+d.decimalTo());

    }
}
