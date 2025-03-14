//Write a Java program that takes two arrays a and b of length n storing
//int values, and returns the dot product of a and b. 
//That is, it returns an array c of length n 
//such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.




package Assingn;
import java.util.*;
public class HAQ3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int n1 = sc.nextInt();
		System.out.println("Enter the length of second array");
		int n2 = sc.nextInt();
		int[] a = new int[n1];
		int[] b = new int[n2];
		System.out.println(Arrays.toString(Inputa(a)));
		System.out.println(Arrays.toString(Inputb(b)));
		System.out.println("Dot product is");
		System.out.println(Arrays.toString(DotProduct(a,b)));
	}
	
	public static int[] Inputa(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input elements of first array");
		for(int i=0; i<a.length; i++) {
			System.out.println("input "+(i+1)+" element ");
			a[i]=sc.nextInt();
		}
		return a; 
	}
	
	public static int[] Inputb(int[] b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input elements of second array");
		for(int i=0; i<b.length; i++) {
			System.out.println("input "+(i+1)+" element ");
			b[i]=sc.nextInt();
		}
		sc.close();
		return b;  
		
	}
	
	public static int[] DotProduct(int[] a, int[] b) {
		//int count = 1;
		int[] c = new int[(int)(Math.max(a.length, b.length))];
		for(int i=0; i<(int)(Math.min(a.length, b.length)); i++){
			
			c[i]=a[i]*b[i];
		}
		
		return c; 
		
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



