// Brute force approach
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// If I am NOT allowed to take the same element multiple times.
public class ThreeSumVersion2 {
    public static List<List<Integer>> threeSum(int n,int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
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
// If I was NOT allowed to take the same element multiple times
/*
Enter the number of elements in the array: 
6
Enter the elements of the array: 
-1 0 1 2 -1 -4
The array elements are: 
-1 0 1 2 -1 -4 
Answer: 
[-1, 0, 1]
[-1, -1, 2]
*/