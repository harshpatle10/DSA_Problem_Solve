package DSA.o5_Bit_manipulation;
class childodd{

    public static void search(int n){
        int bitwise = 1;
        if((n & bitwise)==0){
            // even numer
            System.out.println("Even number !");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
class Odd_Even {
    public static void main(String[] args) {
    childodd.search(7); // odd
    childodd.search(9);   //odd
    childodd.search(12); //even
    }
}
