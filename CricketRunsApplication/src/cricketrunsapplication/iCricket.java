package cricketrunsapplication;

/**
 * iCricket Interface
 * Question 2
 * This interface defines the contract for cricket score operations
 * Any class implementing this interface must provide these methods
 * 
 * @author Siphjo Swartbooi
 */
public interface iCricket {
    
    /**
     * Gets the batsman's name
     * @return String representing the batsman's name
     */
    String getBatsmanName();
    
    /**
     * Gets the stadium name where runs were scored
     * @return String representing the stadium name
     */
    String getStadiumName();
    
    /**
     * Gets the number of runs scored by the batsman
     * @return integer representing runs scored
     */
    int getRunsScored();
}
