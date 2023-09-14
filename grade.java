import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int sub = scanner.nextInt();
        
        int total = 0;
        
        for (int i = 1; i <= sub; i++) 
        {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            total += marks;
        }
        
        double avg = (double) total / sub;
        
        String grade;
        
        if (avg >= 90) 
        {
            grade = "A+";
        }
        else if (avg >= 80) 
        {
            grade = "A";
        }
        else if (avg >= 70) 
        {
            grade = "B";
        }
        else if (avg >= 60) 
        {
            grade = "C";
        }
        else if (avg >= 50) 
        {
            grade = "D";
        }
        else 
        {
            grade = "F";
        }
        
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);
    }
}