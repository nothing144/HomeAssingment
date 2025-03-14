//Write a Java program that takes two arrays a and b of length n storing
//int values, and returns the dot product of a and b. 
//That is, it returns an array c of length n 
//such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.

package Assingn;
import java.util.*;
public class HAQ3withoutMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the length of first array");
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		System.out.println("input the length of second array");
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		int[] c = new int[(int)(Math.max(n1, n2))];
		System.out.println("input the elements of sirst array");
		for(int i=0; i<a.length; i++) {
			System.out.println("input "+(i+1)+" element ");
			a[i]=sc.nextInt();
		}
		System.out.println("input the elements of second array");
		for(int i=0; i<b.length; i++) {
			System.out.println("input "+(i+1)+" element ");
			b[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<(int)(Math.min(n1, n2)); i++) {
			c[i]=a[i]*b[i];
		}
		System.out.println("dot product of the array is ");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
	}

}
//output
//input the length of first array
//3
//input the length of second array
//3
//input the elements of sirst array
//input 1 element 
//1
//input 2 element 
//2
//input 3 element 
//3
//input the elements of second array
//input 1 element 
//4
//input 2 element 
//5
//input 3 element 
//6
//dot product is
//4 10 18 



