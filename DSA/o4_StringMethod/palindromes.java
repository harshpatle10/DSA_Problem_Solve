package DSA.o4_StringMethod;

public class palindromes {
    public static void main(String[] args) {
        String str = "racewcar";

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not palindrome ");
                break;
            }
            if(i+1==str.length()/2)
                System.out.println("it is palindrome");

        }
    }
}
