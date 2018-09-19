# Roman Numeral Converter
========================

Project Title: Number to Roman Numeral Converter

This program will convert a numeric number to its equivalent Roman numeral.


## Getting Started
 
Installing

When the program is unpacked the following directory's will be created:

 	romannumber/src/
	romannumber/bin/

There will be one file in the top level directory:

	 
	README.txt
 
## Source

The program can be found in the /bin directory. By moving into the 
directory romannumber/bin/ - typing the following will run the program
until the user selects 0(zero) to exit:

* To Run the program: 

 	java Roman
 
The program will then prompt for a number to be converted to a Roman numeral:

	Enter value to be converted to Roman notation. 
	Valid range is from 1-3999. '0' - Quit 
	Enter value  : 

* To Exit:

	Enter value to be converted to Roman notation. 
	Valid range is from 1-3999. '0' - Quit 
	Enter value  : 0

	Program has ended

## General Info

## Testing:

Testing can be carried out using eclipse and using JUnit. The tests have
already been created and used, and can be found in romannumber/src/
 
I have included tests in JUnit to check for range issues and to print out
the entire valid range:

Test:

    	1. Invalid range - 0
     	2. Invalid range - 4000
     	3. Valid range 1 = I
    	4. Valid range 3999 = MMMCMXCIX
    	5. Entire range of valid numbers to Roman numerals.

### Code quality:
 
 Code quality can be kept high by compartmentalising using separation of
 concerns. Thereby achieving easily maintainability and readable code.
 
### Code Readability:
 
 Separation of concerns means we can manage and identify behaviour 
 to specific class(s) and is much easier to address when fixing or
 updating the program - It also helps in aiding to help readability.

License: 
[CC-BY](https://creativecommons.org/licenses/by/3.0/) 
 

 
 


 
