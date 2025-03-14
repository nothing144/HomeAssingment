//Write a Java program that takes all the lines input to standard input 
//and writes them to standard output in reverse order.
//That is, each line is output in the correct order, but the ordering of the lines is reversed.

package Assingn;
import java.util.*;
public class HAQ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many lines do you want to enter ");
        int n = sc.nextInt();
        String[] lines = new String[n]; 
        sc.nextLine();
        for(int i=0; i<n; i++) {
        	 System.out.println("line "+(i+1));
        	 lines[i]=sc.nextLine();  
        }
        System.out.println(" ");
        // Printing lines in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        } 
        
        
	}

}
//how many lines do you want to enter 
//3
//line 1
//line first
//line 2
//line second
//line 3
//line third
// 
//line third
//line second
//line first

