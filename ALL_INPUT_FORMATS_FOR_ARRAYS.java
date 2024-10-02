// Helpful for coding in placements especially TCS.
// FOR ARRAYS
import java.util.ArrayList;
import java.util.Scanner;

public class ALL_INPUT_FORMATS_FOR_ARRAYS {
    public static ArrayList<Integer> inputArrayFormat() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                arr.add(num);
            }
        }
        return arr;
    }

    public static ArrayList<Integer> inputSpaceSeparated() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        return arr;
    }

    public static ArrayList<Integer> inputCommaSeparated() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input).useDelimiter(",");
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        return arr;
    }

    public static ArrayList<Integer> inputArraySizeNotGiven() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        return arr;
    }

    public static void main(String[] args) {
        // Case 1: [1,2,3,4,5]
        ArrayList<Integer> arr1 = inputArrayFormat();
        System.out.println("Case 1: [1,2,3,4,5]");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Case 2: 1 2 3 4 5
        ArrayList<Integer> arr2 = inputSpaceSeparated();
        System.out.println("Case 2: 1 2 3 4 5");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Case 3: 1,2,3,4,5
        ArrayList<Integer> arr3 = inputCommaSeparated();
        System.out.println("Case 3: 1,2,3,4,5");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Case with size not given
        ArrayList<Integer> arr4 = inputArraySizeNotGiven();
        System.out.println("Case with size not given");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*
1 2 
Case 1: [1,2,3,4,5]
1 2 
3 45 6
Case 2: 1 2 3 4 5
3 45 6 
222  550 0098  
Case 3: 1,2,3,4,5

2356
Case with size not given
2356 
*/