import java.util.Scanner;

public class AccentureQ {

    public static String result(String s1, String s2){
        String result1 = "Even: ";
        String result2 = "Odd: ";
        int count1 = 0;
        int count2 = 0;
        int start1 = s1.length()-1;
        int start2 = s2.length()-1;

        for(int i = start1;i>=0;i--){
            if(s1.charAt(i) ==' '){
                count1++;
            }
        }
        for(int i = start2;i>=0;i--){
            if(s2.charAt(i) ==' '){
                count2++;
            }
        }
        int sub = Math.abs(count1 - count2);
        if((count1%2)==0){
            return result1+sub;
        }else{
            return result2+sub;
        }
        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(result(s1,s2));
  }  
}
