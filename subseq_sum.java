/*
Subsequences of given array whose elements on adding give the required sum.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class subseq_sum  {
    static int sum = 0;
    static void printSubsequences(int index,ArrayList<Integer> list,int[] arr, int n,int s){
        if(index == n){
            if(sum == s ){
                System.out.println(list);
            }
            return;
        } 
        list.add(arr[index]);
        sum = sum+arr[index];
        printSubsequences(index+1, list, arr, n,s);
        int lastindex = list.size()-1;
        list.remove(lastindex);
        sum = sum-arr[index];
        printSubsequences(index+1, list, arr, n,s);
     
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
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        sc.close();
       
        int start_index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Subsequences whose elements on adding give the required sum are: ");
        printSubsequences(start_index,list,arr,n,sum);
    }
}
/*
Sample Output 1:
Enter the number of elements in the array: 
3
Enter the elements of the array: 
1 2 1
Enter the sum: 
2
Subsequences whose elements on adding give the required sum are: 
[1, 1]
[2]

*/
/*
SAMPLE OUTPUT 2: 
Enter the number of elements in the array: 
6
Enter the elements of the array:
1
2
2
3
4
-1
Enter the sum:
4
Subsequences whose elements on adding give the required sum are: 
[1, 2, 2, -1]
[1, 3]
[1, 4, -1]
[2, 2]
[2, 3, -1]
[2, 3, -1]
[4]
*/
/*If you want distinct subsequences, then you can convert the data structure to a set as set removes the duplicates and maintains unique elements.          
Set<String> set = new HashSet<>(distinctsubseqlist);
System.out.println(set);
*/
