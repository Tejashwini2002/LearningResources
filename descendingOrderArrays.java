
// Program to sort the array in descending order.
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class descendingOrderArrays {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Integer[] a2 = new Integer[a.length];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            a2[i] = Integer.valueOf(a[i]);
        }
        System.out.println("The array elements before sorting in descending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        /*
        Note: When sorting in descending order, Arrays.sort() does not accept an aray of the primitive data type.
        */
        Arrays.sort(a2,Collections.reverseOrder());
        a = Arrays.stream(a2).mapToInt(Integer::intValue).toArray();
        System.out.println("The array elements after sorting in descending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
// OUTPUT: 
/*
Enter the number of elements in the array: 
5
Enter the elements of the array: 
25 98 65 1 43
The array elements before sorting in descending order: 
25 98 65 1 43 
The array elements after sorting in descending order: 
98 65 43 25 1
*/
