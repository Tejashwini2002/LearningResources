/*
Question: You'll be given two unsorted integer arrays of same size along with their size 'n'. You can swap the elements with the array but not between the arrays and your task is to obtain the  minimum sum obtained multiplying a[i] with b[i] where 'i' varies from 0 to (n-1).
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class cognizantQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter the numbers in array a: ");
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Integer[] b2 = new Integer[n];
        System.out.println("Enter the numbers in array b: ");
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
            b2[i] = b[i];
        }
        // Sort one array in ascending order
        Arrays.sort(a);
        // Sort another array in descending order
        Arrays.sort(b2,Collections.reverseOrder());
        b = Arrays.stream(b2).mapToInt(Integer::intValue).toArray();
        long sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum + (a[i]*b[i]);
        }
        System.out.println("The minimum sum of a[i]*b[i] is: "+sum);
    }
}
// SAMPLE OUTPUT: 
/*
Enter the size of the arrays:
3
Enter the numbers in array a: 
2 1 3
Enter the numbers in array b: 
4 5 6
The minimum sum of a[i]*b[i] is: 28
*/
/*
Enter the size of the arrays:
2
Enter the numbers in array a: 
1 2
Enter the numbers in array b: 
0 1
The minimum sum of a[i]*b[i] is: 1
*/

