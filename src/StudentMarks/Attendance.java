package StudentMarks;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the total number of classes
        System.out.print("Enter the total number of classes: ");
        int totalClasses = scanner.nextInt();

        // Get the number of classes attended
        System.out.print("Enter the number of classes attended:     ");
        int attendedClasses = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;

        // Display the attendance percentage
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");

        // Check if the attendance is above a certain threshold (e.g., 75%)
        if (attendancePercentage >= 75) {
            System.out.println("Congratulations! You have good attendance.");
        } else {
            System.out.println("You need to improve your attendance.");
        }

        scanner.close();
    }
}

