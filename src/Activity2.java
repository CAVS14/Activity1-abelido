
import java.util.Scanner;

public class Activity2 { 
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        String name;
        float hrate;
        float hours;
        float thours;
        float contribution;
        
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter hourly rate: ");
        hrate = scanner.nextInt();
        System.out.print("Enter total hours worked this week: ");
        hours = scanner.nextInt();
        
        thours = hours * hrate;
        contribution = (float)(thours * 0.1);
        
        
        System.out.println("----------Wage Summary----------");
        System.out.println("Employee: " +name);
        System.out.println("Hourly Rate: ₱" +hrate);
        System.out.println("Hours Worked: " +hours);
        System.out.println("Gross Weekly Wage:₱" +thours);
        System.out.println("SSS Contribution:₱" +contribution);
        System.out.println("----------");
        System.out.println("Net Weekly Wage:₱"+ (thours - contribution));
        
    }
    
}
