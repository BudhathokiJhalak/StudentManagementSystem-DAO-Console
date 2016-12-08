/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import com.leapfrog.sms.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author zak
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> stdList = new ArrayList<>();
        System.out.println("Welcome to Student Management System of Leapfrog Academy");
        System.out.println("========================================================");
        while (true) {
            System.out.println(" ");
            System.out.println("Please choose number between[1-6]");
            System.out.println("1. ADD Student");
            System.out.println("2. DELETE Student");
            System.out.println("3. SHOW ALL");
            System.out.println("4. Search");
            System.out.println("5. Search BY ID");
            System.out.println("6. EXIT");
            System.out.println("---------------------------------");
            System.out.println("Your Choice:");
            switch (input.nextInt()) {
                case 1:
                    Student student = new Student();
                    System.out.println("Please Enter ID:");
                    student.setId(input.nextInt());
                    System.out.println("Please Enter First-Name:");
                    student.setFirstName(input.next());
                    System.out.println("Please Enter Last-Name:");
                    student.setLastName(input.next());
                    System.out.println("Please Enter Email:");
                    student.setEmail(input.next());
                    System.out.println("Please Enter Contact NO:");
                    student.setContactNo(input.next());
                    System.out.println("Please Enter Address:");
                    student.setAddress(input.next());
                    System.out.println("Please Enter Status:");
                    student.setStatus(input.nextBoolean());

                    stdList.add(student);
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Please Enter ID to Delete:");
                    for (Student s : stdList) {
                        if (s.getId() == input.nextInt()) {
                            stdList.remove(s);
                            System.out.println(" ");
                            System.out.println("Successfully Deleted.");
                        } else {
                            System.out.println(" ");
                            System.out.println("ID doesn't exists!!!");
                        }
                    }

                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Please Wait....");
                    System.out.println(" ");
                    System.out.println("Listing All Students");
                    System.out.println("----------------------");
                    for (Student s : stdList) {
                        System.out.println(s.toString());
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Please Enter KEYWORD:");
                    for (Student s : stdList) {
                        if (s.getFirstName().equalsIgnoreCase(input.next()) || s.getLastName().equalsIgnoreCase(input.next()) || s.getEmail().equalsIgnoreCase(input.next()) || s.getContactNo().equalsIgnoreCase(input.next()) || s.getAddress().equalsIgnoreCase(input.next())) {
                            System.out.println(" ");
                            System.out.println(s.toString());
                        } else {
                            System.out.println(" ");
                            System.out.println("Student doesn't exists!!!");
                        }
                    }
                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println("Please Enter ID to Search:");
                    for (Student s : stdList) {
                        if(s.getId()==input.nextInt()){
                            System.out.println(s.toString());
                        }else{
                            System.out.println(" ");
                            System.out.println("Student doesn't exists!!!");
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }

}
