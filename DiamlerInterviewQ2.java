/*
Return the max steps to reach the end. Follow the below procedure: 
The initial value of the currentIndex is 0.
nextIndex = currentIndex+ element at currentIndex
You must go to nextIndex and repeat the same procedure until you reach the last index or until the value of nextIndex crosses the last index. 
*/
import java.util.Scanner;
public class DiamlerInterviewQ2 {
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
        System.out.println("The maximum steps are: "+ maxSteps(a));
    }
    public static int maxSteps(int[] arr){
        int steps = 0;
        int currentIndex = 0;
        int nextIndex = 0;
        int n = arr.length;
        while(nextIndex<(n-1)){
            nextIndex = currentIndex+arr[currentIndex];
            System.out.println("nextIndex"+nextIndex);
            steps++;
            System.out.println("Step: "+steps);
            currentIndex = nextIndex;
        }
        return steps;
    }
}
// OUPTUT: 
/*
Enter the number of elements in the array: 
10
Enter the elements of the array: 
2 4 1 3 1 1 1 2 1 1
The array elements are: 
2 4 1 3 1 1 1 2 1 1 
nextIndex2
Step: 1
nextIndex3
Step: 2
nextIndex6
Step: 3
nextIndex7
Step: 4
nextIndex9
Step: 5
The maximum steps are: 5
*/ 