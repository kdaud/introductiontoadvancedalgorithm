/**
 * 
 */
package helloworld;

import java.util.Random;

/**
 * @author admins
 *
 */
public class Mentor {
	private static String  name;
	
	//private Date mybirthday;
	//private Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("John speak");
		
		System.out.println(toString("Google Code-in 2019 with OpenMRS"));
		System.out.println(myNumber());
	}
	public static String toString(String message){
		
			return "We want to say thank you for your great work in "+message;
	}
	
	private static int myNumber() {
		Random rad = new Random();
		System.out.println("Success!");
		System.out.println();
		int num = rad.nextInt(87);
		if (num % 2 == 0) {
			System.out.println("Its a multiple of 2");
		}
		return num;
	}


}
