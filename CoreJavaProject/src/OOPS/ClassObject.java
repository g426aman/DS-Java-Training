package OOPS;

import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
        //print the trainer name,technology
        //print the student name,technology
        Trainer trainer = new Trainer();
        trainer.trainerName = "Aman Singh";
        trainer.trainerTechnology = "Java";
        System.out.println("My name is :" + trainer.trainerName + "My technology is " + trainer.trainerTechnology);

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter your name:");
        student.StudentName = sc.nextLine();
        System.out.println("Enter your technology:");

        student.StudentEnrolledTechnology = sc.nextLine();
        System.out.println("your name is " + student.StudentName + " and your technology is " + student.StudentEnrolledTechnology);
    }
}
class Trainer {
    String trainerName;
    String trainerTechnology;

}
class Student {
    String StudentName;
    String StudentEnrolledTechnology;

}
