 import java.util.*;
import java.io.*;
public class TwoDArray{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	PrintWriter writer = new PrintWriter(System.out, true);
	writer.println("Enter Row");
	int m = in.nextInt();
	writer.println("Enter Col");
	int n = in.nextInt();
	String[][] arr = new String[m][n];
	writer.println("Enter the value");
	
	for(int i=0; i<m; i++)
	{
		for(int j=0; j<n; j++)
			{
				arr[i][j]= in.next();		
			}
	}

	writer.println("array elements are ");
	
	for(int i=0; i<m; i++)
	{
		for(int j=0; j<n; j++)
			{
				writer.print(arr[i][j]+"  ");		
			}
		writer.println(" ");
	}
}
}
