package DSA.o2_Arrays.InterviewQ;
class trabedwater{
    public int search(int arr[])
    {
        // dufine maxleft
        int left[] = new int[arr.length];
        left[0]= arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        // define maxright
        int right[] = new int[arr.length];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i]= Math.max(arr[i],right[i+1]);
        }
        // min , waterrain , sum
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            int min = Math.min(right[i],left[i]);
            sum = sum + (min-arr[i]);
        }
        return sum;
    }
}
public class TrapedWater {
    public static void main(String[] args) {
      int arr[] = {4,2,0,6,3,2,5};
    trabedwater td = new trabedwater();
    int result = td.search(arr);
        System.out.println("Answer = "+result);
    }
}
