import java.util.Scanner;
/*
 * 		Description: Grabs the text line and throws an error if 
 * 					 not a valid number - which is caught in main
 */
public class Input  {
	 private static Scanner scanner = null;
 
     public static int getNumericInput() throws NumberFormatException {
    	 scanner = new Scanner(System.in);
       	return Integer.parseInt(scanner.nextLine().toUpperCase());
 	}
}
