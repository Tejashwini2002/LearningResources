/*
Problem statement: 
A teacher will be writing 'n' numbers on the board. She uses red coloured chalk for even numbers and for odd numbers she uses green coloured chalk. The numbers which she will write are given to you in an array. Find how many switches between the pens did the teacher make.
*/
import java.util.Scanner;
public class cognizantque2 {
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
        System.out.println("Max number of switches made by the teacher are: "+maxNumOfSwitches(a));
    }
    public static int maxNumOfSwitches(int[] arr){
        int count = 0;
        boolean prevNumEven = ((arr[0])%2 == 0);
        boolean currNumEven;
        for (int i = 1; i < arr.length; i++) {
            if((arr[i])%2 == 0){
                currNumEven = true;
                if(currNumEven!=prevNumEven){
                    count++;
                    prevNumEven = currNumEven;
                }
                   
            }else{
                currNumEven = false; 
                if(currNumEven!=prevNumEven){
                    count++;
                    prevNumEven = currNumEven;
                }
            }
        }
        return count;
    }   
}
// OUTPUT
/*
Enter the number of elements in the array: 
5
Enter the elements of the array: 
2 1 4 5 3
The array elements are: 
2 1 4 5 3 
Max number of switches made by the teacher are: 3
*/
/*
Enter the number of elements in the array: 
6
Enter the elements of the array: 
2 1 4 5 3 98
The array elements are: 
2 1 4 5 3 98 
Max number of switches made by the teacher are: 4
*/
