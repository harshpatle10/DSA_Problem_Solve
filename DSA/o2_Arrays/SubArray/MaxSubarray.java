package DSA.o2_Arrays.SubArray;

public class MaxSubarray {

    public int callmethod(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int k=i;k<arr.length;k++)
            {
                System.out.print("[");
                int sum = 0;
                for(int j=0;j<=k;j++)
                {
                    System.out.print(arr[j]+",");
                    sum = sum +arr[j];
                }
                if(sum>max)
                    max = sum;

                System.out.print("]\n");
                count++;
            }
        }
        System.out.println("total sub arrays = "+count);
    return  max;
    }
}
class Maxrun{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubarray ms = new MaxSubarray();
      int x=   ms.callmethod(arr);
        System.out.println("max sub array = "+x);
    }
}

