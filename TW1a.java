
/*
Additional programs to be implemented:
 1.1) It is required to store and analyze data about 6 car manufacturer’s sales data in all the 12 months of a year. Demonstrate how you would store the data in a two dimensional matrix and do the following
1.	Write a function to Find for a given car manufacturer, the month in which maximum no. of cars are sold.
2.	Write a function to Find the average number of cars sold for each car manufacturer
3.	Write a function to Find the total number of cars sold for each car manufacturer. 
4.	Write a function to find standard deviation for a given car manufacturer
Assume – row index  0 - ‘Maruti Suzuki’, 1 – ‘Hundai’  2 – ‘Tata Motors’  3-‘KIA’  4 – ‘BMW’	5 – ‘Renault’
                    Col index 0 –‘Jan’, 1-‘Feb’………………………………….11 –‘Dec’
Demonstrate the working of the program with appropriate values for each car manufacturer and the months.
  
 */
import java.util.Scanner;

public class TW1a {
    public static void main(String[] args) {
        int[][] sales = new int[6][12];
        int[] total = { 0, 0, 0, 0, 0, 0 };
        int[] avg = new int[15];
        double[] SD = { 0, 0, 0, 0, 0, 0 };
        String[] car_manufac = {"Maruti Suzuki","Hundai","Tata Motors","KIA","BMW","Renault"};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the sales data of manufacturer " + (i + 1) +" "+ car_manufac[i]);
            for (int j = 0; j < 12; j++) {
                sales[i][j] = sc.nextInt();
                // total[i] = total[i] + sales[i][j];
              
            }
        }
        for (int i = 0; i < 6; i++) {
            avg[i] = computeAvg(sales[i][0], sales[i][1], sales[i][2], sales[i][3], sales[i][4], sales[i][5],
                    sales[i][6], sales[i][7], sales[i][8], sales[i][9], sales[i][10], sales[i][11]);

            total[i] = computeTotal(sales[i][0], sales[i][1], sales[i][2], sales[i][3], sales[i][4], sales[i][5],
            sales[i][6], sales[i][7], sales[i][8], sales[i][9], sales[i][10], sales[i][11]);
            
            SD[i] = computeSD(sales);
        }
        
        
        for (int i = 0; i < car_manufac.length; i++) {
            System.out.println("Sales data of "+ car_manufac[i] );
            System.out.println("total number of cars sold = " + total[i]);
            System.out.println("Average number of cars sold = " + avg[i]);
            
        }
    }

static int computeTotal(int m1,int m2,int m3,int m4,int m5,int m6,int m7,int m8,int m9,int m10,int m11,int m12){
  int sum = ( m1+  m2+  m3+  m4+  m5+  m6+  m7+  m8+  m9+  m10+  m11+  m12);
  return sum;
}

static int computeAvg(int m1,int m2,int m3,int m4,int m5,int m6,int m7,int m8,int m9,int m10,int m11,int m12){
    return (int)Math.ceil(computeTotal(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12)/12.0);
}



}

