package cricketrunsapplication;

/**
 * Question 2
 * This abstract class implements iCricket interface and provides
 * common functionality for cricket score tracking
 * 
 * @author Sipho Swartbooi
 * 
 */
public abstract class CricketScore implements iCricket {
    
    // =====================================================================
    // VARIABLE DECLARATIONS (Encapsulated with private access)
    // =====================================================================
    private String batsmanName;    // Stores the batsman's name
    private String stadiumName;    // Stores the stadium name
    private int runsScored;        // Stores the runs scored
    
    // =====================================================================
    // CONSTRUCTOR
    // =====================================================================
    
    /**
     * Constructor for CricketScore class
     * @param batsmanName The name of the batsman
     * @param stadiumName The name of the stadium
     * @param runsScored The number of runs scored
     */
    public CricketScore(String batsmanName, String stadiumName, int runsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.runsScored = runsScored;
    }
    
    // =====================================================================
    // GETTER METHODS (Implementation of iCricket interface)
    // =====================================================================
    
    /**
     * Gets the batsman's name
     * @return batsmanName
     */
    @Override
    public String getBatsmanName() {
        return batsmanName;
    }
    
    /**
     * Gets the stadium name
     * @return stadiumName
     */
    @Override
    public String getStadiumName() {
        return stadiumName;
    }
    
    /**
     * Gets the runs scored
     * @return runsScored
     */
    @Override
    public int getRunsScored() {
        return runsScored;
    }
    
    // =====================================================================
    // ABSTRACT METHOD (To be implemented by subclasses)
    // =====================================================================
    
    /**
     * Abstract method to print runs scored report
     * Must be implemented by any concrete subclass
     */
    public abstract void printRunsScored();
}
