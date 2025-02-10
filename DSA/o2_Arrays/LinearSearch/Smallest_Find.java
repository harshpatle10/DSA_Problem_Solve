package DSA.o2_Arrays.LinearSearch;
class FindNum{
    public int Getsmall(int []arr)
    {
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(small>arr[i])
                small=arr[i];
        }
        return small;
    }
}
public class Smallest_Find {
    public static void main(String[] args) {
        int arr[] ={2,6,4,3,9,-1,-23,9,3,6};

        FindNum f = new FindNum();
       int small = f.Getsmall(arr);
//        System.out.println("Smallest num of array : \{small}");

    }
}
