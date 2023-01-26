package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());


		Binary num1 = new Binary("1001110");
		Binary num2 = new Binary("1011010");

		Binary orResult = Binary.OR(num1, num2);
		Binary andResult = Binary.AND(num1, num2);
		Binary multiplyResult = Binary.multiply(num1, num2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("PROJECT DELIVERABLES QUESTIONS: ");
		System.out.println("");
		System.out.println("The two binary numbers are: " + num1.getValue() + " and " + num2.getValue());
		System.out.println("");
		System.out.println("Bitwise OR:" + orResult.getValue());
		System.out.println("Bitwise AND:" + andResult.getValue());
		System.out.println("Bitwise multiply:" + multiplyResult.getValue());
    }
}