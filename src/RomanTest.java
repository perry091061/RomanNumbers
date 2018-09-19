import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 *   Checks made:
 *   	 
 *   	1. Invalid range - 0
 *   	2. Invalid range - 4000
 *   	3. Valid range 1 = I
 *   	4. Valid range 3999 = MMMCMXCIX
 *   	5. Entire range of valid numbers o Roman numbers
 */
class RomanTest {
 	
	@Test
	void testGenerateZero() {
		RomanNumeral num = new RomanNumeral();
		 assertEquals(num.generate(0),"0","Invalid range");
	}
	
	@Test
	void testGenerate4000() {
		RomanNumeral num = new RomanNumeral();
		 assertEquals(num.generate(4000),"MMMM","Invalid range");
	}
	
	@Test
	void testGenerate1() {
		RomanNumeral num = new RomanNumeral();
		assertEquals(num.generate(1),"I","Valid min range");
	}
	
	@Test
	void testGenerate3999() {
		RomanNumeral num = new RomanNumeral();
		assertEquals(num.generate(3999),"MMMCMXCIX","Valid max range");
	}

	@Test
	void testGenerateAll() {
		RomanNumeral num = new RomanNumeral();
		for(int i=1; i< 4000; i++) {
		 System.out.println("\n"+num.generate(i));
		}
	}
}
