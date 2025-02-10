package DSA.o4_StringMethod;

public class NSWE_direction {

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x =0 , y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S') {
                y--;
            }
            else if ( str.charAt(i)=='E') {
            x++;
            }
            else if(str.charAt(i)=='W') {
                x--;
            }

        }
        int x2 = x*x;
        int y2 = y*y;
        double res = Math.sqrt(x2+y2);
        System.out.println(res);
    }
}
