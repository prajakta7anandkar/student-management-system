package main;

import interfacee.StudentInterfaceOperations;
import interfacee.StudentInterface;
import model.Student;

import java.util.Scanner;

public class StudentOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StudentInterface dao=new StudentInterfaceOperations();
        System.out.println("=================================================================================");
        System.out.println("=================== Welcome to Student Management application ===================");
        System.out.println("=================================================================================");
        while(true){
        	
        	System.out.println("\t\t  1 --> Add Student");
			System.out.println("\t\t  2 --> Show all students records");
			System.out.println("\t\t  3 --> Search students based on roll number");
			System.out.println("\t\t  4 --> Delete Student");
			System.out.println("\t\t  5 --> Update Student record");
			System.out.println("\t\t  6 --> Exit");
            
            System.out.println("==============================================================================");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Add Student");
                    System.out.println("==============================================================================");
                    System.out.println("Enter student name");
                    String name=sc.next();
                    
                    System.out.println("Enter student college name");
                    String clgName=sc.next();
                    
                    System.out.println("Enter city");
                    String city=sc.next();
                    
                    System.out.println("Enter Percentage");
                    double percentage=sc.nextDouble();
                    
                    Student st=new Student(name,clgName,city,percentage);
                    
                    boolean ans=dao.insertStudent(st);
                    if(ans)
                    	
                        System.out.println("=================== Record inserted Successfully =====================");
                    else
                        System.out.println("============== something went wrong, please try again ================");

                    break;
                case 2:
                    System.out.println("Show all students ");
                    System.out.println("==============================================================================");
                    dao.showAllStudent();
                    System.out.println("==============================================================================");
                    
                    break;
                case 3:
                    System.out.println("Get student based on rollnumber");
                    System.out.println("==============================================================================");
                    System.out.println("enter roll number");
                    int roll=sc.nextInt();
                  boolean f=  dao.showStudentById(roll);
                  System.out.println("==============================================================================");
                  if(!f)
                      System.out.println("Student with this id is not available in our system");

                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.println("==============================================================================");
                    System.out.println("enter roll number to delete");
                    int rollnum=sc.nextInt();
                    boolean ff=dao.delete(rollnum);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    System.out.println("==============================================================================");
                    break;
                case 5:
                    System.out.println("Update the student");
                    System.out.println("==============================================================================");
                    System.out.println("\n1.Update name\n2.Update clgName");
                    System.out.println("==============================================================================");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("enter roll number");
                        int rnum=sc.nextInt();
                        System.out.println("Enter new name");
                        String sname=sc.next();
                        Student std=new Student();
                        std.setName(sname);
                      boolean flag=  dao.update(rnum,sname,choice,std);
                      if(flag)
                          System.out.println("Name updated successfully");
                      else
                          System.out.println("Something went wrong...");
 }
                    break;
                case 6:
                    System.out.println("Thank You for using Student management application!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
        }


    }
}
