import java.util.Scanner;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal;
        int remainder;
        String hexadecimal = "";
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.println("Input a decimal number: ");
        decimal = sc.nextInt();
        int quotient = decimal;
        while(quotient>0){
            remainder = quotient%16;
            hexadecimal = hex[remainder]+hexadecimal;
            quotient = quotient/16;    
        }
        System.out.print("Hexadecimal value is: "+hexadecimal);
    }
}
/*
Input a decimal number: 
192
Hexadecimal value is: C0
*/
/*
Input a decimal number: 
168
Hexadecimal value is: A8
*/