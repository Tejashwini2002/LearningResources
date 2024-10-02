/*
Problem statement
You are given an array ‘ARR’ containing ‘N’ integers.

Return all the unique triplets [ARR[i], ARR[j], ARR[k]] such that i != j, j != k and k != i and their sum is equal to zero.

Example:
Input: ‘N’ = 6 
'ARR' =  [-1 0 1 2 -1 -4] 

Output:
Answer:
[-1, -1, 2]
[-1, 0, 1]
[0, 0, 0]
[-4, 2, 2]

Explanation:
((-1) +(-1) +2)) = ((-4)+2+2) = (-1+ 0+ 1)=(0+0+0) = 0.
*/
// If I was allowed to take the same element multiple times
// Brute force approach
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ThreeSumVersion1 {
    public static List<List<Integer>> threeSum(int n,int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                  List<Integer> temp = new ArrayList<>();
                  if((arr[i]+arr[j]+arr[k])==0){
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    Collections.sort(temp);
                    if(set.contains(temp)){

                    }else{
                        set.add(temp);
                        ans.add(temp);
                    }
                  }
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        System.out.println("The array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        List<List<Integer>> ans = threeSum(n, a);
        System.out.println("Answer: ");
        for (List<Integer> row : ans) {
             /*
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
            */
            System.out.println(row);
        }
    }
}

/*
Enter the number of elements in the array: 
6
Enter the elements of the array: 
-1 0 1 2 -1 -4
The array elements are: 
-1 0 1 2 -1 -4 
Answer: 
[-1, -1, 2]
[-1, 0, 1]
[0, 0, 0]
[-4, 2, 2]
*/
