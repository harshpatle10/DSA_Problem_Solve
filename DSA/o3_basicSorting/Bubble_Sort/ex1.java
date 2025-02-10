package DSA.o3_basicSorting.Bubble_Sort;
// bigo of n^2 time complex city
class parent{

    public int searching(int []arr)
    {  int count=0;
        int a =0;
        int b=0;
        for(int i=0;i<arr.length-1;i++){
            a++;
          for(int k=i+1;k<arr.length;k++) {
              b++;
                  count++;
              if(arr[i]>arr[k]) {
                  int temp = arr[k];
                  arr[k]= arr[i];
                  arr[i] = temp;
              }
          }
        }
        System.out.println(a+" + "+b);
        return count;
    }
    public void print(int arr[])
    {
        for(int i:arr) {
            System.out.print(i);
        }
    }
  }


public class ex1 {
    public static void main(String[] args) {
        int arr[] = {3,5,2,1,4};
        parent p = new parent();
        p.searching(arr);
        p.print(arr);
    }
}
