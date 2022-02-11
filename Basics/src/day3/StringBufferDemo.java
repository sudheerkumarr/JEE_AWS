/*
 * StringBuffer
 *  mutable
 *  Concatenation operation are faster compare to String
 *  Thread Safe - methods are synchronized
 *  
 */
package day3;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(20);
		StringBuffer sb3 = new StringBuffer("Hello");
		StringBuffer sb4 = new StringBuffer("Hello");
		//char[] chArr = {'H', 'e', 'l', 'l', 'o'};
		//StringBuffer sb4 = new StringBuffer(chArr);
		
		System.out.println(sb3);
		//sb3.append(" World!");
		
		//System.out.println(sb3); // Hello World
		
		// compare
		System.out.println(sb3.equals(sb4)); //false 
		System.out.println(sb3==sb4);//false
		
		// capacity -default -16
		// new capacity = (oldCapacity*2)+2 = 34, 70
		
		System.out.println();
		System.out.println(sb.capacity()); //16
		System.out.println(sb2.capacity()); //20
		System.out.println(sb3.capacity()); //21
		
//		System.out.println();
//		System.out.println(sb3.length());//5
//		sb3.append("asdfgggqweaaaaaaaa");
//		System.out.println(sb3.length());//
//		System.out.println(sb3.capacity());//
		
		System.out.println();
		System.out.println(sb.length());//0
		sb.append("asdfgggqweaaaaaaaa");
		System.out.println(sb.length());//18
		System.out.println(sb.capacity());// 34
		
		// Converting StringBuffer to String
		System.out.println();
		String str1 = new String(sb3);
		System.out.println(str1.getClass().getName());
		String str2 = new String(sb4);
		System.out.println(str2.getClass().getName());
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
		// reverse a string
		// convert String to StringBuffer
		StringBuffer sb6 = new StringBuffer("Hello");
		System.out.println(sb6.reverse());
		System.out.println(sb6);
		
		
	//String Builder
		System.out.println();
		StringBuilder sbr = new StringBuilder();
		System.out.println(sbr.capacity());
		System.out.println(sbr.length());
		
		// methods
		
		char character = 'a';    
		int ascii = (int) character;
		System.out.println(ascii);
		
		
		

	}

}
