/* Return the most rhyming word for the given string among the given strings in an array. Note that if all the letters of the string match with the input string then, then they are not rhyming words, instead they are same words. In that case return "No Word". */
import java.util.*;

public class AccentureQ3 {

    public static String Most_Rhyming(String inputString, String[] arr,int n){
        Scanner sc = new Scanner(System.in);
        String output1 = "No word";
        
        int count = 0; // count of same characters (as of inputString) from last index of current string
        int maxlen = 0;
        String maxLenString = new String();
        int pointer1 = inputString.length()-1;// points to indices of the given input string

        boolean allMatch = true;

        for(int i = 0;i<n;i++){
            if(!arr[i].equalsIgnoreCase(inputString)){
                allMatch = false;
                break;    
            }
        }
        if (allMatch) {
            return output1;
        }

        for(int i = 0;i<n;i++){
            String current_str;// pointing to each element of the input array
            current_str =  arr[i];
            int pointer2 = current_str.length()-1;// points to indices of the current string taken from the array
            
            while(pointer1>=0 && pointer2>=0){

                if(inputString.charAt(pointer1) == current_str.charAt(pointer2)){
                    count++;
                    pointer1--;
                    pointer2--;
                }
                else{
                    break;
                }
                
            }
            System.out.println("Current String: "+current_str+"\ncount: "+count);
            if(count>maxlen){
                maxlen = count;
                maxLenString = current_str;
            }
            count = 0;
            pointer1 = inputString.length()-1;

        }
        return maxLenString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String: ");
        String inputStr = sc.nextLine();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();// the newline character left in the input buffer after reading an integer with sc.nextInt().
        String[] arr = new String[n]; //inputArray
        System.out.println("Enter the array elements (the list of strings to be compared with the given string:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println("The input string: "+inputStr);
        System.out.println("Size of the input array: "+n);
        System.out.println("The array elements are: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The most rhyming word among the given array of strings is: "+Most_Rhyming(inputStr, arr, n));
    }
}
/*
Enter the input String: 
Childhood
Enter the size of the array: 
4
Enter the array elements (the list of strings to be compared with the given string:
hood
would
ood
d
The input string: Childhood
Size of the input array: 4
The array elements are: 
hood would ood d 
Current String: hood
count: 4
Current String: would
count: 1
Current String: ood
count: 3
Current String: d
count: 1
The most rhyming word among the given array of strings is: hood
*/