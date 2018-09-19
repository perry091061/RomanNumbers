/*
 *  Written by	: Perry Davies
 *  Date		: 30/8/2018
 *  
 *  Description : Simple command line application that will return a number
 *  			  expressed as a Roman number.
 *  
 *  JUnit 		: Test cases include:
 *   	
 *   	1. Invalid range - 0
 *   	2. Invalid range - 4000
 *   	3. Valid range 1 = I
 *   	4. Valid range 3999 = MMMCMXCIX
 *   	5. Entire range of valid numbers o Roman numbers
 * 
 */
public class Roman {

	private final static String MESSAGE = "\nEnter value to be converted to roman notation. \n"
										+ "Valid range is from 1-3999. '0' - Quit \n" + "Enter value  : ";
	private final static String ERROR = "\nInvalid range - number must be between 1 - 3999 inclusive.\n";
	private final static String END_MESSAGE = "\nProgram has ended.\n";

	public static void main(String[] args) {
		RomanNumeral roman = new RomanNumeral();
		int number = 0;
		do {

			System.out.print(MESSAGE);

			try {

				number = Input.getNumericInput();

				if (number == 0)
					break; // we wish to exit
				System.out.println(roman.generate(number));

			} catch (NumberFormatException e) {
				System.out.println(ERROR);
			}  

		} while (true);
		System.out.println(END_MESSAGE);

	}

}
