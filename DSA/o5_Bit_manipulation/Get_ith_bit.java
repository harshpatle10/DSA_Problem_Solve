package DSA.o5_Bit_manipulation;

public class Get_ith_bit {

    public static   void get(int num , int i){
        int bitwise = 1 << i;
        if ((num & bitwise)==0){
           // add number
            System.out.println("odd number !");
        }
        else{
            System.out.println("even number !");
        }
    }
}
class driverget{
    public static void main(String[] args) {
        Get_ith_bit.get(8,2); // 1'0'00  = 0 // 2 place ans
        Get_ith_bit.get(3,2); // 00'0'11  = 0 //2 place  ans

    }
}
