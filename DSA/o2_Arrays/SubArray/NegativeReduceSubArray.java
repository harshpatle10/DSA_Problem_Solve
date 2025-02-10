package DSA.o2_Arrays.SubArray;

import FileHandling.MethodOfFile.Name;

public class NegativeReduceSubArray {

    public int callmethod(int arr[])
    {
            int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int k=0;k<=i;k++) {
                 sum = sum +arr[k];
               if(sum<0)
                sum=0;
            }
//            System.out.print(sum);
            if(sum>max)
                max = sum;
//         System.out.print(max);
        }
      return max;
    }

}
class Negativerun {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        NegativeReduceSubArray n = new NegativeReduceSubArray();
        System.out.println(n.callmethod(arr));
    }
}

