// // Question on Integer Overflow
// public class DiamlerQ {
//    public static void main(String[] args) {
//     int i = 2147483648;
//     System.out.println(i);
//    } 
// }
// // 2147483647
// /*
// DiamlerQ.java:4: error: integer number too large
//     int i = 2147483648;
//             ^
// 1 error
// */
///////////////////////////////////////////////////////////////////////////////////
// // Question on Integer Overflow
public class DiamlerQ {
   public static void main(String[] args) {
   //  int i = Integer.MAX_VALUE+1;
   /* 
   System.out.println(Integer.MAX_VALUE+1); // OUTPUT: -2147483648  
   */
//   int i = -2147483649;
//   System.out.println(i); // -2147483648 // The value becomes a negative value
   } 
}
// // 2147483647
// /*
// DiamlerQ.java:4: error: integer number too large
//     int i = 2147483648;
//             ^
// 1 error
// */
