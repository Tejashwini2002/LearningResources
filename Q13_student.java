
class Student {
    String name;
    int roll;
    int m1, m2, m3;

    Student(String name, int roll, int m1, int m2, int m3) {

        this.name = name;
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void avg() {
        // float average=(m1+m2+m3)/3;
        // System.out.println("Average of "+roll+"is:"+average);
        int min = m1;
        if (m2 < min)
            min = m2;
        if (m3 < min)
            min = m3;
        int sum = (m1 + m2 + m3 - min);
        float average = (sum / 3);
        System.out.println("Average of Roll_num " + roll + " is: " + average);
    }

    void display() {
        // System.out.println("Student"+roll+":");
        System.out.println("Student name: " + name);
        System.out.println("Student marks1: " + m1);
        System.out.println("Student marks2: " + m2);
        System.out.println("Student marks3: " + m3);

    }
}

public class Q13_student {
    public static void main(String[] args) {
        Student[] ob = new Student[5];

        ob[0] = new Student("Preeti", 1, 45, 42, 24);
        ob[1] = new Student("Naina", 2, 49, 22, 24);
        ob[2] = new Student("Sameer", 3, 15, 12, 24);
        ob[3] = new Student("Munna", 4, 35, 42, 29);
        ob[4] = new Student("Pandit", 5, 50, 42, 30);

        System.out.println("Student 1:");
        ob[0].display();
        ob[0].avg();
        System.out.println("Student 2:");
        System.out.println("\n");
        ob[1].display();
        ob[1].avg();
        System.out.println("Student 3:");
        System.out.println("\n");
        ob[2].display();
        ob[2].avg();
        System.out.println("Student 4:");
        System.out.println("\n");
        ob[3].display();
        ob[3].avg();
        System.out.println("Student 5:");
        System.out.println("\n");
        ob[4].display();
        ob[4].avg();

    }
}