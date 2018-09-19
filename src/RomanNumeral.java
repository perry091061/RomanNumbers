 /*
  *  Description: Implements RomanNumeralGenerator interface.
  *  			  Depending on the number the quotient is used to determine the number of times
  *  			  the roman character is appended.
  *  
  */

public class RomanNumeral implements RomanNumeralGenerator {
	@Override
	public String generate(int dividend) throws NumberFormatException {
		// Ensure valid range
		if (!((dividend > 0) && (dividend < 4000))) {
			throw new NumberFormatException();
		}

		StringBuilder sb = new StringBuilder();
		int quotient = 0;
		// Subtractive notation
		String[] roman = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		 
		// Working from 1000 we find the number of times this occurs similarly for each successive division
		int[] divisor = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;
		
		for (int i = 0; i < divisor.length; i++) {
			// Provides the number of times the divisor goes into the dividend
			quotient = dividend / divisor[i];
			dividend %= divisor[i];
			while (quotient > 0) {
				sb.append(roman[i]);
				quotient--;
			}
		}
		return sb.toString();
	}

}
