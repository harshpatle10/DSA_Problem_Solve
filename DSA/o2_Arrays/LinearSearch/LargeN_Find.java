package DSA.o2_Arrays.LinearSearch;

public class LargeN_Find {
    public int Getlarge(int arr[] )
    {
        int LargestNUm = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(LargestNUm < arr[i])
                LargestNUm = arr[i];
        }
        return LargestNUm;
    }
}

class numfind {
    public static void main(String[] args) {
        int arr[] = {4,7,3,1,9,15,3};

        LargeN_Find lf = new LargeN_Find();
       int large =  lf.Getlarge(arr);
        System.out.println("large num = "+large);

    }
}
