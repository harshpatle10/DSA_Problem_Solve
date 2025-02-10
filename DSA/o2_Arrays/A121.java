package DSA.o2_Arrays;
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
 */
public class A121 {
    public static void main(String[] args) {
        int prieces[] = {1,2};


        int max =1;
        int day =0;
        int find =Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<prieces.length-1;i++){
            for(int k=1+i;k<prieces.length;k++){
                 sum = prieces[k]-prieces[i];
                if(max<sum ){
                    max = sum;
                    System.out.println(max);
                    day = k;
                    find =sum;
                }
            }
        }
        if(find<0){
            System.out.println(day);
        }
        else
            System.out.println(day+1);
    }
}
