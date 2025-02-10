package DSA.o2_Arrays;

import leetcodeQ.BeforExam.ArrayAndSum;

import java.util.ArrayList;
import java.util.List;

/*
Input: rowIndex = 3
Output: [1,3,3,1]

 */
public class A118 {
    public static void main(String[] args) {
     int nums = 3;
        List <List<Integer>> numslist = new ArrayList<>();
        numslist.add(new ArrayList<>());

         numslist.get(0).add(1);
     for(int i=1;i<=nums;i++){
         List <Integer> curr = new ArrayList<>();
         curr.add(1);
         for(int k=1;k<i;k++){
             int n = numslist.get(i-1).get(k-1) +numslist.get(i-1).get(k);
             curr.add(n);
         }
         curr.add(1);
         numslist.add(curr);
     }
        System.out.println(numslist);

    }
}
