/**
 * 
 */
package helloWorld;

/**
 * @author Sony
 *
 */
public class helloJava {

	/**
	 * @param args
	 */
	
	
	
	static int temperature =90;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 12;
		
		
		
		boolean statement = true;
		//System.out.println("statement="+statement);
		
		
		statement = 10 < 0;
		System.out.println("statement value1 ="+statement);
		
		statement = 10 > 0;
		System.out.println("statement value2 ="+statement);
		
		statement = 10 == 0;
		System.out.println("statement value3 ="+statement);
		
		
		
		//byte = -128 to 127 
		
		int i = 900;
		byte day = 125;
		System.out.println("day  ="+day);
		
		//short = values from -32768 to 32767 
		
		short x = 10000;
		
		//int = -231 to 231-1 (32-bit signed two's complement integer).
		// -2^31 to 2^31
		// -2147483648  to 2147483647
		
		int y = 214748364;
		
		//The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
			//    	 -2^63 to 2^63       -1
		//   -9223372036854775808  to  9223372036854775807
		
		
		long z = 9223372036854775807L;
		
		System.out.println("z  ="+z);
		
		double a = 50.45;
		double b = 65.39;
		
		
		System.out.println("a  ="+a*b);
		
		
		
		

	}

}
