package DSA.o1_MethodORFunction.ConvertionBInaryDecimal;

import java.util.Scanner;

 class BinaryToDecimal {

public static int binarytoD(int n){
    int sum = 0;
    int power=0;
    while(n>0)
    {
        int rem = n%10;
         sum = sum + (rem*(int)Math.pow(2,power));
        n = n/10;
        power++;
    }
    return sum;
}
}

class driver{
    public static void main(String[] args) {
        BinaryToDecimal b = new BinaryToDecimal();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter binary number : ");
        int num = kb.nextInt();

        System.out.println(b.binarytoD(num));
    }
}
