package DSA.o1_MethodORFunction.Mathomaticalcode;

import java.util.Scanner;

public class create {
    public static  int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 2 number : ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(sum(a,b));
    }
}
