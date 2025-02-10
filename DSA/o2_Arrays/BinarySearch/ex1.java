package DSA.o2_Arrays.BinarySearch;

public class ex1 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 6, 1, 5, 9};
        int k = 1;
        int start = 0;
        int end = arr.length;
        while (start<end) {
            int mid = (start+end)/2;
            if (arr[mid]==k) {
                System.out.println(mid);
                break;
            }
            if (arr[mid] < k)
                start = mid + 1;
            else
                end = mid-1;
        }
    }
}
