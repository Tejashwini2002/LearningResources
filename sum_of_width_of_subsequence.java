/*
The width of a sequence is the difference between the maximum and minimum elements in the sequence.

Given an array of integers nums, return the sum of the widths of all the non-empty subsequences of nums.
*/
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class sum_of_width_of_subsequence  {
    static int sum = 0;

    static void printSubsequences(int index,ArrayList<Integer> list,int[] arr, int n){
        int width = 0;
        if(index == n){
            if(!list.isEmpty()){
                int min = Collections.min(list);
                int max = Collections.max(list);
                width = max-min;
                sum = sum+width;
            }
            
                //System.out.println(list);
            return;
        } 
        list.add(arr[index]);
        printSubsequences(index+1, list, arr, n);
        int lastindex = list.size()-1;
        list.remove(lastindex);
        printSubsequences(index+1, list, arr, n);
     
    }

    public int sumSubseqWidths(int[] nums){
        int start_index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(start_index,list,nums,nums.length);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {3,1,2};
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        
        sc.close();
        sum_of_width_of_subsequence obj = new sum_of_width_of_subsequence();
        int result = obj.sumSubseqWidths(nums);
        System.out.println(result);
    }
}
/*
SAMPLE OUTPUT 1:
Enter the number of elements in the array: 
1
Enter the elements of the array: 
2
0

*/
/*
SAMPLE OUTPUT 2:
Enter the number of elements in the array: 
3
Enter the elements of the array: 
2 1 3
6
*/
