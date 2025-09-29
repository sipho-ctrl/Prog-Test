package cricketrunsapplication;

/**
 * Question 2
 * This class demonstrates the usage of the inheritance hierarchy
 * It instantiates objects and calls methods to produce the required output
 * 
 * @author Sipho Swartbooi
 */
import java.util.Scanner;

public class RunApplication {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // =====================================================================
        // USER INPUT SECTION
        // =====================================================================
        
        System.out.println("CRICKET RUNS APPLICATION");
        System.out.println("========================");
        
        // Get input from user
        System.out.print("Enter the batsman name: ");
        String batsmanName = scanner.nextLine();
        
        System.out.print("Enter the stadium name: ");
        String stadiumName = scanner.nextLine();
        
        System.out.print("Enter the runs scored by " + batsmanName + " at " + stadiumName + ": ");
        int runsScored = scanner.nextInt();
        
        // =====================================================================
        // OBJECT INSTANTIATION AND METHOD CALLS
        // =====================================================================
        
        // Create an instance of CricketRunsScored using the constructor
        CricketRunsScored cricketReport = new CricketRunsScored(batsmanName, stadiumName, runsScored);
        
        // Display separation line
        System.out.println("\n" + "=".repeat(50));
        
        // Call the printRunsScored method to display the report
        cricketReport.printRunsScored();
        
        // Optional: Call the detailed report method for additional output
        cricketReport.printDetailedReport();
        
        // =====================================================================
        // DEMONSTRATING POLYMORPHISM
        // =====================================================================
        
        // Demonstrate polymorphism: Using parent class reference
        System.out.println("DEMONSTRATING POLYMORPHISM:");
        System.out.println("-".repeat(30));
        
        // Reference of parent type pointing to child object
        CricketScore polyReport = new CricketRunsScored("AB de Villiers", "Wanderers", 5200);
        
        // This will call the child class implementation due to polymorphism
        polyReport.printRunsScored();
        
        // =====================================================================
        // DEMONSTRATING INTERFACE USAGE
        // =====================================================================
        
        System.out.println("DEMONSTRATING INTERFACE METHODS:");
        System.out.println("-".repeat(35));
        
        // Using interface reference (true polymorphism)
        iCricket interfaceReport = new CricketRunsScored("Hashim Amla", "Kingsmead", 3800);
        
        // Call interface methods
        System.out.println("Batsman (via interface): " + interfaceReport.getBatsmanName());
        System.out.println("Stadium (via interface): " + interfaceReport.getStadiumName());
        System.out.println("Runs (via interface): " + interfaceReport.getRunsScored());
        
        // Close scanner
        scanner.close();
        
        System.out.println("\nAPPLICATION COMPLETED SUCCESSFULLY!");
    }
}
