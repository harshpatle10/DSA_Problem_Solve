package DSA.o3_basicSorting.InsertionSorting;

class Insertion{
    public  int  reverse(int arr[]){
        int count=0;
        for(int i = 1;i<arr.length;i++) {
            for(int k=i-1;k>=0;k--){
                count++;
                if(arr[k]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }


        return count;
    }

}


public class reversesort {
    public static void main(String[] args) {
        int arr[] = {2,5,1,6,3,4};
        Insertion i = new Insertion();
      int n =  i.reverse(arr);
        System.out.println(n);

    }
}
