
import java.util.Scanner;

public class Activity1{

    public static void main (String[] args){
    
        Scanner scanner = new Scanner (System.in);
        int total = 0;
        int subjects;
        float average;
        String name;
        String remarks;
        
        System.out.print("Enter student name : ");
        name = scanner.nextLine();
        
        System.out.print("Enter number of subjects : ");
        subjects = scanner.nextInt();   
        
        for (int a = 1; a <= subjects; a++){
            System.out.print("Enter grade for sub " + a + " :");
            total += scanner.nextInt();
        
        }
        average = (float)total / (float)subjects;
        
        if (average >= 75){
            remarks = "PASSED";
        }
        else{
            remarks = "FAILED";
        }
        System.out.printf("\nAverage : %.2f\n", average);
        System.out.println("Remarks : " + remarks);
    }

}