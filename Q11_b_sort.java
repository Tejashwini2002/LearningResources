
// Homework Question 

import java.util.Scanner;

class methodOverload {
    int i, j, n;

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

    void sort(int arr[], int from_index, int to_index, String order) {
        if (order.equals("ascending")) {
            int temp;
            for (i = from_index; i < to_index - 1; i++) {
                for (j = from_index; j < to_index - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Array elements after sorting in Ascending order the elements from from index to to index:");
            for (i = 0; i < n; i++)
                System.out.printf("%d\n", arr[i]);

        } 
        else if (order.equals("descending")) {
            int temp;
            for (i = from_index; i < to_index - 1; i++) {
                for (j = from_index; j < to_index - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }
                }
            }
            System.out.println("Array elements after sorting in Descending order the elements from from index to to index:");
            for (i = 0; i < n; i++)
                System.out.printf("%d\t", arr[i]);
        }
    }
}

 public class Q11_b_sort{
    public static void main(String[] args) {
      methodOverload obj = new methodOverload();
              Scanner sc = new Scanner(System.in);
             
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
              obj.sort(arr, 4, 6, "descending");
    }
        

}