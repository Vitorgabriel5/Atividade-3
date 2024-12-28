package aplication;

import bulletin.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name=sc.nextLine();
        System.out.print("Quarterly Note: ");
        student.grade1 =sc.nextDouble();
        System.out.print("Quarterly Note: ");
        student.grade2 =sc.nextDouble();
        System.out.print("Quarterly Note: ");
        student.grade3 =sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n ", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("Missing %.2f Points%n",student.missingPoints());
        }else {
            System.out.println("PASS");
        }
        sc.close();
    }
}