package DSA.o2_Arrays.SubArray;

public class EasySubArray {

    public int callmethod(int arr[])
    {
        int sum =0;
        int kk[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int k=0;k<=i;k++) {
                kk[i] = kk[i]+arr[k];
            }
        }
      return kk[kk.length-1];
    }

}
class Easyrun{
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        EasySubArray er = new EasySubArray();
       int res =  er.callmethod(arr);
        System.out.println("total sum of max sub array = "+res);
    }
}

