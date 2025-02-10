package DSA.o2_Arrays.LinearSearch;
class Find{

    public  int Getnum(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
public class Num_Find {
    public static void main(String[] args) {

        int arr[] = {1,3,2,6,4,8,-1};
        Find f = new Find();
      int result =   f.Getnum(arr,8);
        if(result==-1)
            System.out.println("Not find in array");
        else
            System.out.println("find num of position : "+(result+1));
    }
}
