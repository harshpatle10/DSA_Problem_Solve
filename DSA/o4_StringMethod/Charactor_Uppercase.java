package DSA.o4_StringMethod;

public class Charactor_Uppercase {
    public static void main(String[] args) {
        String str = "i am hash patle ";
        StringBuilder sb = new StringBuilder("");
       sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' '){
                sb.append(str.charAt(i));
                if( (i+1)<str.length() && str.charAt(i+1)!=' ' )
                {
                    char ch = Character.toUpperCase(str.charAt(i+1));
                    sb.append(ch);
                    i++;
                }
            }
            else
                sb.append(str.charAt(i));

        }
        System.out.println(sb.toString());
    }
}
