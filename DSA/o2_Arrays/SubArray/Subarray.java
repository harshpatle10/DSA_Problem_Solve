package DSA.o2_Arrays.SubArray;

public class Subarray {

    public int callmethod(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int k=i;k<arr.length;k++)
            {
                if(k==i)
                    System.out.print("["+arr[i]+"]\n");
                else
                    System.out.print("["+arr[i]+","+arr[k]+"]\n");
            }
        }
        int x = arr.length*(arr.length+1)/2;
    return  x;
    }
}
class Subrun {
    public static void main(String[] args) {
        int arr[] = {2,5,1,6,4};
        Subarray s = new Subarray();
        int count =    s.callmethod(arr);
        System.out.println("total subarray : "+count);

    }
}
