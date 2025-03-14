//Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and column with the most 1s.
//Sample run:
//0 0 1 1 0 0 1 1 1 1 0 1 1 0 1 0
//The largest row index: 2
//The largest column index: 2




package Assingn;
import java.util.*;
public class HAQ5 {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				a[i][j]=(int)(Math.random()*2);
			}
		}
					
			for(int i=0; i<4; i++) {
				for(int j=0; j<4; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
	}

}
//output
//0 0 1 0 
//0 0 0 1 
//0 1 1 0 
//1 1 1 1 



