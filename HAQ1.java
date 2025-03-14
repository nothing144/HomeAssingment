//Write a Java program that takes as input three integers, a, b, and c, 
//from the Java console and determines if they can be used in a 
//correct arithmetic formula (in the given order), like “a + b = c,” “a = b − c,” or “a b = c.”∗
//
package Assingn;
import java.util.*;
public class HAQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a ");
		int a = sc.nextInt();
		System.out.println("input b ");
		int b = sc.nextInt();
		System.out.println("input c ");
		int c = sc.nextInt();
		System.out.println("can do arithmatic operation: "+arithmatic(a, b, c));
		
	}
	public static boolean arithmatic(int a, int b, int c) {
		return ((a+b)==c)||(a==(b-c))||((a*b)==c); 
	}

}
//input a 
//2
//input b 
//3
//input c 
//5
//can do arithmatic operation: true
