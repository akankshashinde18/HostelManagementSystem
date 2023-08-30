package javaproject;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student{
    public Student(String name,  int age, String contactNo, String address) {
       
    }

 public void setWantsMessFacility(boolean wantsMessFacility) {
  // TODO Auto-generated method stub
  
 }

 public boolean isWantsMessFacility() {
  // TODO Auto-generated method stub
  return false;
 }

 public String getName() {
  // TODO Auto-generated method stub
  return null;
 }


 public String getContactNo() {
  // TODO Auto-generated method stub
  return null;
 }

    // Getters and setters for student details
}

class Hostel {
    private String name;
    private String location;
    private int totalRooms;
    private int availableRooms;
    // Add more hostel details and facilities here as per your requirements

    public Hostel(String name, String location, int totalRooms, int availableRooms) {
        this.name = name;
        this.location = location;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
    }

    // Getters and setters for hostel details and facilities
}

public class HostelManagementSystem {
 private static final String DB_URL = "jdbc:mysql://localhost:3309/hostel_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12345678";
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Hostel> hostels = new ArrayList<>();
    private static HashMap<Integer, String> roomAllocations = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize hostels and students (You can add more hostels and students here)

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    displayHostelDetails();
                    break;
                
                case 2:
                    takeAdmission();
                    break;
  
                case 3:
                    System.out.println("Exiting Hostel Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
    private static void displayMenu() {
        System.out.println("\n========= Wel_come  =========");
        System.out.println("1. Display Hostel Details Facilities");
        System.out.println("2. Take Admission");
        System.out.println("3. Exit");
        System.out.println("=================================================\n");
        System.out.print("Enter your choice: ");
    }

    private static void displayHostelDetails() {
        System.out.println(">> Pooja Hostel <<\n Address - Shantai Plaza, Sadashiv Peth, Pune \n Facilities - "
          + "\n 1) Security guard 24x7 \n 2) Mess Facility avaliable \n 3) Water: RO facility to be provided.\n 4)"
          + " Daily cleaning \n 5) Medical facility available with first aid \n 6) Study Areas \n 7) Free WiFi  " );
        
    }

    private static void takeAdmission() {
        System.out.println("\n===== Take Admission =====");

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter student's contact number: ");
        String contactNo = scanner.nextLine();

        System.out.print("Enter student's address: ");
        String address = scanner.nextLine();

        System.out.print("Does the student want mess facility? (yes/no): ");
        String messChoice = scanner.nextLine();

        boolean wantsMessFacility = messChoice.equalsIgnoreCase("yes");

        // Create a new Student object with the entered details
        Student student = new Student(name, age, contactNo, address);

        // Set whether the student wants mess facility
        student.setWantsMessFacility(wantsMessFacility);

        // Calculate and display the fees structure
        displayFeesStructure(student);

        // Add the student to the ArrayList of students
        students.add(student);

    }

    private static void displayFeesStructure(Student student) {
        System.out.println("\n===== Fees Structure =====");

        //if (student.isWantsMessFacility())
        {
            System.out.println("Fees for accommodation with mess facility: $6000 per month");
     //   } else 
        }
            {
            System.out.println("Fees for accommodation only: $3000 per month");
        }
           
        System.out.println("Admission taken successfully! \n Pay your fess as soon as possible \n *****THANK YOU****");
    }

    private static void showStudentRecords() {
        // Implement this method to show student records
    }

    // You can add more methods for database programming to store and retrieve data.
}
