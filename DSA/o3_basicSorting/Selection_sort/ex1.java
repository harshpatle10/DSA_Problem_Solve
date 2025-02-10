package DSA.o3_basicSorting.Selection_sort;

// this code is used to find sort element of
// array in min swaping of two value in memory

class parent{

    public void select(int arr[])
    {

        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int k=i+1;k<arr.length-1;k++)
            {
                if(arr[min]>arr[k]){
                    min = k;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
    }
    public void print(int []arr)
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }

}



public class ex1 {
    public static void main(String[] args) {
        parent p = new parent();
        int arr[] = {1,5,3,2,4};
        p.select(arr);
        p.print(arr);
    }
}
