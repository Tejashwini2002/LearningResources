
// Homework Question 

import java.util.Scanner;

class methodOverload {
    int i, j,n;

    void sort(int arr[]) {
        
        int temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("Array elements after sorting in Ascending order:");
        for (i = 0; i < n; i++)
            System.out.printf("%d\n", arr[i]);

    }

    void sort(int arr[], int n) {
        int temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.println("Array elements after sorting in Descending order:");
        for (i = 0; i < n; i++)
            System.out.printf("%d\n", arr[i]);

    }

}

public class TW_5a_4{
    public static void main(String[] args) {
      
              Scanner sc = new Scanner(System.in);
              methodOverload obj = new methodOverload();
              System.out.println("Enter the number of elements in the array.");
              obj.n = sc.nextInt();
              int arr[] = new int[obj.n];
              System.out.println("Enter the elements of the arraay");
              for(int i = 0;i<obj.n;i++)
              {
                arr[i] = sc.nextInt();
              }
              obj.sort(arr);
              obj.sort(arr, obj.n);
    }
        

}
