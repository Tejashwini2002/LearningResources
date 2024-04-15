
/*
  4.2)	Design a base class called Employee who work for a Hospital and this class would have name, dob, address, salary and designation as the attributes. Add a constructor to initialize all these data  members. This class would have reportForDuty method to display reporting time and date with a “Welcome” message to the employee.  Devise two derived classes Doctor and Nurse to have expertise and yearsofExperience as data members respectively.  Devise a method performDuty in each of these derived classes to print appropriate message depending on expertise of doctor and years of experience. For instance if the experitise of the Doctor is Surgeon  and yearsofExperience >10 then print “Perform Heart Operation”  else perform “Perform minor Surgery”.  If his expertise is orthopedic and experience is more than 5 years “Perform surgery and Plastering” else “Perform Plastering”. If the nurse has more than 3 years experience in performDuty method print “Check BP, Sugar” and “Administer medicine” else  print “Look after the patient”.  Create a Hospital Class that has main method, and instantiate objects of Doctor and Nurse and Perform reportForDuty and performDuty  and record the output. Add a static method generateReport(Employee e) that accepts object of employee type and prints in a tabular form, Name, dob, birthday salary and the designation.
Note :
To get current time and date create an object of Calendar class declared in java.util package by importing it… import java.util.Calendar. to create calendar object..
Calendar cal=Calendar.getInstance();
To print date and time System.out.println(cal.getTime());
*/
import java.util.Calendar;

class Employee {
  String name, address, designation, dob;
  // int dob;
  double salary;

  Employee(String name, String address, String designation, String dob, double salary) {
    this.name = name;
    this.address = address;
    this.designation = designation;
    this.dob = dob;
    this.salary = salary;
  }

  // void show() {
  // System.out.println("\nName: " + name + "\n" + "Address: " + address + "\n" +
  // "Designation: " + designation + "\n"
  // + "Date of Birth: " + dob + "\n" + "Salary: " + salary + "\n");
  // }
  Calendar cal = Calendar.getInstance();

  void reportForDuty() {
    System.out.println("\nWELCOME");
    System.out.println("Date and Reporting Time: " + cal.getTime());
  }

}

class Doctor extends Employee {
  String expertise;
  int yearsofExperience;

  Doctor(String name, String address, String designation, String dob, double salary, String expertise,
      int yearsofExperience) {
    super(name, address, designation, dob, salary);
    this.expertise = expertise;
    this.yearsofExperience = yearsofExperience;
  }

  void performDuty() {
    if (expertise.equalsIgnoreCase("Surgeon")) {
      if (yearsofExperience > 10) {
        System.out.println("Perform Heart Operation");
      } else {
        System.out.println("Perform minor Surgery");
      }
    }

    else if (expertise.equalsIgnoreCase("Orthopedic")) {
      if (yearsofExperience > 5) {
        System.out.println("Perform surgery and Plastering");
      } else {
        System.out.println("Perform Plastering");
      }
    } else {

    }
  }
}

class Nurse extends Employee {
  int yearsofExperience;

  Nurse(String name, String address, String designation, String dob, double salary, int yearsofExperience) {
    super(name, address, designation, dob, salary);
    this.yearsofExperience = yearsofExperience;
  }

  void performDuty() {
    if ((yearsofExperience > 3)) {
      System.out.println("Check BP, Sugar");
      System.out.println("Administer medicine");
    } else {
      System.out.println("Look after the patient");
    }
  }
}

public class TW_4a {
  // public class Hospital must be driver class actually.
  public static void main(String[] args) {
    Doctor d = new Doctor("Teju", "Dharwad", "Doctor", "25/9/2002", 1000000, "orthopedic", 8);
    // d.show();

    d.reportForDuty();
    generateReport(d);
    d.performDuty();

    Nurse n = new Nurse("Shravya", "Mysore", "Nurse", "27/5/2003", 10000, 4);
    // n.show();
    n.reportForDuty();
    generateReport(n);
    n.performDuty();

  }

  static void generateReport(Employee e) {
    System.out.println("\nName: " + "\t\t" + "Address: " + "\t" + "Designation: " + "\t"
        + "Date of Birth: " + "\t" + "Salary: " + "\n" + e.name + "\t\t" + e.address + "\t\t" + e.designation + "\t\t"
        + e.dob + "\t" + e.salary);
  }
}
