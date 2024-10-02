/*
Problem statement
You are given an array ‘ARR’ containing ‘N’ integers.

Return all the unique triplets [ARR[i], ARR[j], ARR[k]] such that i != j, j != k and k != i and their sum is equal to zero.

Example:
Input: ‘N’ = 5 
'ARR' =  [-1, -1, 2, 0, 1] 

Output: 
-1 -1 2
-1 0 1

Explanation:
(-1 -1 +2) = (-1 +0 +1) = 0.
*/
// Approach 2: Better approach
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

// If I am NOT allowed to take the same element multiple times.
public class ThreeSumVersion3 {
    public static List<List<Integer>> threeSum(int n,int[] arr){
        List<List<Integer>> ansList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int arrk = -(arr[i]+arr[j]);
                if(map.containsKey(arrk)){
                  List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arrk);
                    Collections.sort(temp);
                    set.add(temp);
                    map.put(arr[j],j);//(ele, index)   
                } 
                else{
                    map.put(arr[j],j);
                }   
            }
            map.clear(); // to avoid taking the same element multiple times /* If I do like this, then inside the  map I always put elements which are in between the indices pointed by i and j */
        }
        ansList.addAll(set);
        return ansList;
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
// If I was NOT allowed to take the same element multiple times
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
*/
