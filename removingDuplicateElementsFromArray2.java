import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class removingDuplicateElementsFromArray2{
    public static int[] removeDuplicates(int arr[]){
        int arrLen = arr.length;
        if(arrLen == 0 || arrLen == 1){
            return arr;
        }else{
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0;i<arrLen-1;i++){
                if(arr[i]!=arr[i+1]){
                    al.add(arr[i]);
                }
            }

            al.add(arr[arrLen-1]);
            Integer[] arr2 = al.toArray(new Integer[al.size()]);
            int[] intArray = Arrays.stream(arr2).mapToInt(Integer::intValue).toArray();
                                                                                                        
            return intArray;
        }
    }
    public static void printArray(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        System.out.println("The array elements before sorting are: ");
        printArray(arr);

        Arrays.sort(arr);
        System.out.println("\nThe array elements after sorting are: ");
        printArray(arr);

        System.out.println("\nThe array elements after removing Duplicates are: ");
        arr = removeDuplicates(arr);
        printArray(arr);
    }
}
/*
OUTPUT:
Enter the number of elements: 
5
Enter the array elements: 
10 20 20 30 10
The array elements before sorting are: 
10 20 20 30 10 
The array elements after sorting are: 
10 10 20 20 30 
The array elements after removing Duplicates are: 
10 20 30 
*/