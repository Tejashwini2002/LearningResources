// Optimal Approach
/* A leader is an element which is greater than all elements towards its right.*/
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArrayOptimal {
    public static ArrayList<Integer> printleadersOptimal(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        /* Last element of an array is always a leader as no elements exist towards its right. So push it into ans array*/
        ans.add(arr[n-1]);
        int max = arr[n-1]; /* You can also initialize it as INT_MIN if you want. */
        /* Start checking from the end whether a number is greater thean max no. from right, hence leader. */
        for(int i = n-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = printleadersOptimal(arr, n);
        Collections.sort(ans,Collections.reverseOrder()); // to sort the list in descending order
        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
/*
OUTPUT:
22 12 6
*/
