/*Additional problem definitions:
5.2)	Implement a linear search function by using method overloading concept for an array of integers, double and character elements.*/

/*
  // LINEAR SEARCH IN ARRAY IN C PROGRAMMING

#include <stdio.h>

int linearSearch(int arr[], int size, int element)
{
  for (int i = 0; i < size; i++)
  {
    if (arr[i] == element)
      return i;
  }
  return -1;
}
int main()
{
  int arr[] = {1, 3, 5, 56, 4, 3, 23, 5, 4, 4561, 56, 34};
  int size = sizeof(arr) / sizeof(int);
  int element = 56;
  int searchIndex = linearSearch(arr, size, element);
  printf("The element %d was found at index %d \n", element, searchIndex);
  return 0;
}
*/
import java.util.Scanner;
public class TW_5a_1 {
int size1,size2,size3;
public int linearSearch(int[] a, int size, int key){
  for (int i = 0; i < size; i++)
  {
    if (a[i] == key)
      return i;
  }
  return -1;
   
}
public int linearSearch(double[] a, int  size, double key){
  for (int i = 0; i < size; i++)
  {
    if (a[i] == key)
      return i;
  }
  return -1;
  
   
}
public  int linearSearch(char[] a, int  size, char key){
  for (int i = 0; i < size; i++)
  {
    if (a[i] == key)
      return i;
  }
  return -1;
   
  
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TW_5a_1 obj = new TW_5a_1();
        
        System.out.println("Enter the number of elements in the array of type integer .");
        obj.size1 = sc.nextInt();
        int arr1[] = new int[obj.size1];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<obj.size1;i++)
        {
          arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the key element to be searched.");
        int key1 = sc.nextInt();

        int searchIndex1 = obj.linearSearch(arr1, obj.size1, key1 );
        System.out.printf("The element %d was found at index %d \n", key1, searchIndex1);

        System.out.println("Enter the number of elements in the array of type double.");
        obj.size2 = sc.nextInt();
        double arr2[] = new double[obj.size2];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<obj.size2;i++)
        {
          arr2[i] = sc.nextDouble();
        }
        System.out.println("Enter the key element to be searched.");
        double key2 = sc.nextDouble();
        int searchIndex2 = obj.linearSearch(arr2, obj.size2, key2 );
        System.out.printf("The element %f was found at index %d \n", key2, searchIndex2);

        System.out.println("Enter the number of elements in the array of type  character .");
        obj.size3 = sc.nextInt();
        char arr3[] = new char[obj.size3];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i<obj.size3;i++)
        {
          arr3[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the key element to be searched.");
        char key3 = sc.next().charAt(0);
        int searchIndex3 = obj.linearSearch(arr3, obj.size3, key3 );
        System.out.printf("The element %c was found at index %d \n", key3, searchIndex3);
       
    }
}
