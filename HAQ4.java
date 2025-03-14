//Write a method to add two matrices. The header of the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
//In order to be added, the two matrices must have the same dimensions and the same or compatible types of elements.
 
package Assingn;
import java.util.*;
public class HAQ4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row and col");
		int row = sc.nextInt();
		int col=sc.nextInt();
		double[][] a = new double[row][col];
		double[][] b = new double[row][col];
		System.out.println("enter "+row*col+" elements for first array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter "+row*col+" elements for second array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				b[i][j]=sc.nextInt(); 
			}
		}
		System.out.println("addition of two arrays:");
        double[][] c = addMatrix(a, b);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
	
	}
		
		

	  public static double[][] addMatrix(double[][] a, double[][] b){
		
		double[][] c = new  double[a.length][a[0].length];
		
		for(int i=0; i<a.length; i++) {//a.length to access rows
			for(int j=0; j<a[0].length; j++) {//a[0].length to acces coloumn
				c[i][j]= a[i][j]+b[i][j];
			}
		}
		return c; 
	}
	
	
		
	

}


//enter row and col
//2 3
//enter 6 elements for first array
//1 2 3 4 5 6
//enter 6 elements for second array
//1 2 3 4 5 6
//addition of two arrays:
//2.0 4.0 6.0 
//8.0 10.0 12.0 






