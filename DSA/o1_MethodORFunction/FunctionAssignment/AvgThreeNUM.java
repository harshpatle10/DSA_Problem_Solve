package DSA.o1_MethodORFunction.FunctionAssignment;
class Calculated{
    private int a;
    private int b;
    private int c;


    public Calculated(int a,int b,int c)
    {
        this.a= a;
        this.b= b;
        this.c=c;
    }
    public int ThreeSum(){
        return (a+b+c)/2;
    }
    public boolean isEven(int n)
    {
        return n%2==0;
    }
}
public class AvgThreeNUM {
    public static void main(String[] args) {
        Calculated c =new Calculated(10,20,30);
        System.out.println("the avg of three number : ");
        System.out.println(c.ThreeSum());
        System.out.println("Enter num for check the value is Even or odd :");
        System.out.println(c.isEven(34));
    }


}
