/**
 * The ErrorHandling class provides methods for handling different types of errors.
 */
/**
 * The ErrorHandling class provides methods for performing various error handling checks.
 */
public class ErrorHandling {

    /**
     * Divides the dividend by the divisor.
     * Add code to handle the ArithmeticException that occurs when dividing by zero using try catch.
     * @param dividend The dividend.
     * @param divisor  The divisor.
     * @return The result of the division or null.
     */
    public static Double divide(int dividend, int divisor) {
        try {
            return (double) (dividend / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }      
    }

    /**
     * Complete method to check if a String represents a valid int using try catch
     * @param str The String to check
     * @return true if a valid int
     */
    public static  boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }   
    }
}