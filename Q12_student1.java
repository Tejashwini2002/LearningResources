
//Homework question

import java.util.Scanner;

// import java.util.Formatter; If you want you can use to formatt your output.

class Student_Details {
    String name;
    int r_no;
    float m1, m2, m3;
    float avg;

    // Student_Details( String n, int r, float marks1, float marks2, float marks3) {

    Student_Details() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        this.name = sc.nextLine();

        System.out.println("Enter Rollnumber");
        r_no = sc.nextInt();
        System.out.println("Enter marks1, marks2,marks3");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    float Average(float marks1, float marks2, float marks3) {

        float min = marks1;
        if (marks2 < min)
            min = marks2;
        if (marks3 < min)
            min = marks3;
        float sum = (marks1 + marks2 + marks3 - min);
        this.avg = (sum / 2.0f);
        return avg;
    }

    void display() {
        System.out.println("Name:\t\tRoll_no:\t\tMarks1:\t\tMarks2:\t\tMarks3:\t\tAverage(Best Two):");
        System.out.printf("%s\t\t%d\t\t%f\t\t%f\t%f\t%f", name, r_no, m1, m2, m3, avg);

    }

}

public class Q12_student1 {
    public static void main(String[] args) {
        Student_Details obj = new Student_Details();
        
  //In Java, a constructor is called when an instance of the class is created.At the time of calling the constructor,memory for the object is allocated in the memory.It is a special type of method which is used to initialize the object.Everytime an object is created using the new keyword,atleast one constructor is called.
  //Everytime an object is created using the new keyword,atleast one constructor is called.It calls a default constructor if there is no constructor available in the class.In such case,Java compiler provides a default constructor by default.



        obj.Average(obj.m1, obj.m2, obj.m3);
        obj.display();


    }

}