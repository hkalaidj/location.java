package location;
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		
		
		System.out.print("Enter the number of rows and columns in the array: ");
		Scanner input=new Scanner(System.in);
		int row=input.nextInt();
		
		int column=input.nextInt();
		
		double[][] matrix=new double[row][column];
		
		
		for( int i=0;i<row;i++)
			{for (int j=0;j<column;j++)
				matrix[i][j]=input.nextDouble();
				}
		 int index1=0;
		 int index2=0;
			double max=matrix[0][0];
			for(int i=0;i<row ;i++)
			 for (int j=0;j<column;j++)
				 if (max<matrix[i][j])
				 { max=matrix[i][j];
			index1=i;
			index2=j;}
		
			
			 System.out.println("Max element is: "+max+" at location " +"("+index1+","+index2+")");
			
			 }
			
		}


	
