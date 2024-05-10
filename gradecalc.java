import java.util.*;
import java.util.Scanner;



public class gradecalc {
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        int marks1;
        System.out.println("Enter your marks for Physics:");
        marks1 = num.nextInt();
        
        int marks2;
        System.out.println("Enter your marks for Chemistry:");
        marks2 = num.nextInt();

        int marks3;
        System.out.println("Enter your marks for Maths:");
        marks3 = num.nextInt();
        float Totalmarks;
        Totalmarks = marks1 + marks2 +marks3;
        float perc;
        perc = Totalmarks/3;

        System.out.println("Total marks obtained are: " + Totalmarks + "/300" );
        System.out.println("percentage obtained: " + perc +"%");
        String grade;
        if(perc>90){
            grade = "A";
            System.out.println(grade);
        }
        else if(perc >= 80 & perc<90 ){
            grade = "B";
            System.out.println("Grade obtained: "+grade);
        }
        else if(perc >= 60 & perc<80 ){
            grade = "C";
            System.out.println("Grade obtained: "+grade);
        }
        else if(perc >=50 & perc <60){
            grade = "C";
            System.out.println("Grade obtained: "+grade);
        }
        else if(perc >=40 & perc <50){
            grade = "D";
            System.out.println("Grade obtained: "+grade);
        }
        else if(perc >=30 & perc <40){
            grade = "E";
            System.out.println("Grade obtained: "+grade);
        }
        else if(perc <30){
            grade = "F";
            System.out.println("Grade obtained: "+grade);
        }


    }
}
