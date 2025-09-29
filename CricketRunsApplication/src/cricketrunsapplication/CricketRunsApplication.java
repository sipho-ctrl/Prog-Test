package cricketrunsapplication;

/**
 *Student Name:Sipho Swartbooi
 * Student Number: ST10467895
 */

/**
 * Question 1
 * This application records and displays runs scored by three batsmen
 * at three different stadiums using 2D arrays
 * 
 * @author Sipho Swartbooi
 */
import java.util.Scanner;

public class CricketRunsApplication {
    
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // =====================================================================
        // ARRAY DECLARATIONS
        // =====================================================================
        
        // Single-dimensional array to store stadium names
        String[] stadiums = {"KINGSMEAD", "ST GEORGES", "WANDERERS"};
        
        // Single-dimensional array to store batsmen names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        
        // Two-dimensional array to store runs scored
        // Rows represent stadiums, Columns represent batsmen
        // Format: runs[stadium_index][batsman_index]
        int[][] runs = new int[3][3];
        
        // =====================================================================
        // DATA INPUT - Populating the 2D array with user input
        // =====================================================================
        
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("---");
        
        // Nested loops to get input for each stadium and each batsman
        for (int i = 0; i < stadiums.length; i++) {          // Loop through stadiums
            for (int j = 0; j < batsmen.length; j++) {       // Loop through batsmen
                System.out.print("Enter the number runs scored by " + batsmen[j] + 
                               " at " + stadiums[i] + ": ");
                runs[i][j] = scanner.nextInt();  // Store input in 2D array
            }
        }
        
        // =====================================================================
        // GENERATING THE RUNS SCORED REPORT
        // =====================================================================
        
        System.out.println("---");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("---");
        
        // Display individual runs for each batsman at each stadium
        for (int j = 0; j < batsmen.length; j++) {           // Loop through batsmen first
            for (int i = 0; i < stadiums.length; i++) {      // Then loop through stadiums
                System.out.println(batsmen[j] + " runs scored at " + 
                                 stadiums[i] + ": " + runs[i][j]);
            }
            System.out.println();  // Empty line between batsmen
        }
        
        // =====================================================================
        // CALCULATING AND DISPLAYING TOTALS PER STADIUM
        // =====================================================================
        
        System.out.println("---");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("---");
        
        // Array to store total runs for each stadium
        int[] stadiumTotals = new int[3];
        int maxRuns = 0;          // Variable to track highest runs
        String topStadium = "";   // Variable to store stadium with most runs
        
        // Calculate total runs for each stadium
        for (int i = 0; i < stadiums.length; i++) {
            int total = 0;
            for (int j = 0; j < batsmen.length; j++) {
                total += runs[i][j];  // Sum runs for all batsmen at this stadium
            }
            stadiumTotals[i] = total;  // Store total in stadiumTotals array
            
            // Display the total for this stadium
            System.out.println(stadiums[i] + "\t" + stadiumTotals[i]);
            
            // Check if this stadium has the most runs so far
            if (total > maxRuns) {
                maxRuns = total;
                topStadium = stadiums[i];
            }
        }
        
        // =====================================================================
        // DISPLAYING THE STADIUM WITH MOST RUNS
        // =====================================================================
        
        System.out.println("\nSTADIUM WITH THE MOST RUNS: " + topStadium);
        System.out.println("---");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
