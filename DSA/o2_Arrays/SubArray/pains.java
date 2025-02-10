package DSA.o2_Arrays.SubArray;
class p{
    public static void search(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int k=i+1;k<arr.length;k++)
            {
                count++;
                System.out.println("pairs  = ("+arr[i]+","+arr[k]+")");
            }
        }
        System.out.println(count);
    }
        }
public class pains {
    public static void main(String[] args) {
        int arr[] = {3, 1, 6, 2, 9};
        p kk = new p();
        p.search(arr);
    }
}
