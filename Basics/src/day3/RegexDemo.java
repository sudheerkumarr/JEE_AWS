/*
 * Regex
 *   validation
 *   
 * Quantifiers
 * '?' - 0-1 occurance of pattern 
 * '+' - 1 or more 
 * '*' - 0 or more
 * '{10}' - number of times to occur
 * '{5, 10}' - min 5 & upto 10
 * '{5, }' - min 5 & max can be any number of time
 * 
 * 
 * Metacharecters
 * \d - represents single digit
 * \D - represents single non-digit
 * \s - represents space
 * \S - represents non space char
 * \w - matches word chars [0-9a-zA-Z_$]
 * \W - matches other than word chars
 *  . - single character
 *  
 *  9962512345- 
 *   pattern - \d\d\d\d\d\d\d\d\d\d
 *           - [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]...
 *           - \d{10}
 *           - [0-9]{10}
 *           -
 *           
 *   
 *  abc@gmail.com
 *   pattern - \w\w\w@gmail.com
 *           - \w{3}@\w+\.\w{3}
 *           - [a-zA-Z]+@[a-zA-Z]+\.[a-zA-Z]{3}
 *           
 *  022-23451234
 *    pattern - 022-[0-9]{8}
 *    
 * 
 *    1888 634 1407 (Toll Free)
 *    613 701 98270 (Toll Number) #
 *    496925511337 (Toll Number) #
 *    + 91 124 2641407 (International call rates applicable)
 *    contactus@airindia.in
 *    flyingreturn.base@airindia.in
 *    Contact Number : 011 24667473 (Monday to Friday ,0930 hrs - 1730 hrs IST)
 *    
 *    ip address - 10.10.0.1 - 
 *    1.1.1.1 - 255.255.255.255
 *    \d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}
 *    
 *    fe80::59bb:236d:3f6b:2363%6
 *    [a-fA-F0-9]{1,4}::[a-fA-F0-9]{1,4}::[a-fA-F0-9]{1,4}::[a-fA-F0-9]{1,4}
 *    
 */
package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(".a"); // regex pattern
		Matcher matcher = pattern.matcher("ga"); // actual string
		System.out.println(matcher.matches()); 
		
		//Pattern pattern1 = Pattern.compile("\\d{5,10}"); // regex pattern
		Pattern pattern1 = Pattern.compile("[0-9]{5,10}"); // regex pattern
		Matcher matcher1 = pattern1.matcher("99999"); // actual string
		System.out.println(matcher1.matches());
		
		// mr. & mrs. - 
		boolean b = Pattern.matches("mr\\.", "mr.");
		boolean b1 = Pattern.matches("mrs\\.", "mrs.");
		System.out.println(b);
		System.out.println(b1);
		
		// one pattern to match both mr. & mrs.
		//boolean b2 = Pattern.matches("mrs?\\.", "mr.");
		boolean b2 = Pattern.matches("mr\\.\s&\smrs\\.", "mr. & mrs.");
		System.out.println(b2);
		
		String ph = "022-23451234";
		System.out.println(Pattern.matches("\\d{3}-\\d{8}", ph));
		
		
		Pattern p = Pattern.compile("(\\d{3})-(\\d{8})");  
		Matcher m = p.matcher(ph);
		System.out.println(m.matches());
		System.out.println(m.group()); // 022-23451234
		System.out.println(m.group(1));//022
		System.out.println(m.group(2));//23451234
		
		
		Pattern p2 = Pattern.compile("m.a");  
		Matcher m2 = p2.matcher("maa");
		//System.out.println(m2.find()); // true
		System.out.println(m2.matches()); // false
		System.out.println(m2.start()); // 5
		System.out.println(m2.end()); //8
		
		
		
		

	}

}
