package DSA.o6_Recursion;
public class ex1 {
public  static void   callrecursin(int n){
    if(n==1){
        System.out.print(n);
          return;
    }
    System.out.print(n+"  ");
    callrecursin(n-1);
}
    public static void main(String[] args) {
    callrecursin(10);

    }
}
