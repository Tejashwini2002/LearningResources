import java.util.ArrayList;
import java.util.Scanner;
public class subsequence {
    static void printSubsequences(int index,ArrayList<Integer> list,int[] arr, int n){
        if(index == n){
            System.out.println(list);
            
            return;
        } 
        list.add(arr[index]);
        printSubsequences(index+1, list, arr, n);
        int lastindex = list.size()-1;
        list.remove(lastindex);
        printSubsequences(index+1, list, arr, n);
        
        /*
        If you want to print in this order, 
         []
         [2]
         [1]
         [1, 2]
         [3]
         [3, 2]
         [3, 1]
         [3, 1, 2]
        then print before adding and removing elements to the list.

        printSubsequences(index+1, list, arr, n);
        list.add(arr[index]);
        printSubsequences(index+1, list, arr, n);
        int lastindex = list.size()-1;
        list.remove(lastindex);
        */
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {3,1,2};
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
       
        int start_index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        printSubsequences(start_index,list,arr,n);
    }
}
/*
Sample Output:
Enter the number of elements in the array: 
3
Enter the elements of the array: 
3 1 2
[3, 1, 2]
[3, 1]
[3, 2]
[3]
[1, 2]
[1]
[2]
[]
*/