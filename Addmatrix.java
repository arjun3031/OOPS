import java.util.*;
class Addmatrix{
	public static void main(String args[]){
		int i,j,rows,cols;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		rows=sc.nextInt();
		System.out.println("Enter the cols:");
		cols=sc.nextInt();
		int A[][]=new int[rows][cols];
		int B[][]=new int[rows][cols];
		System.out.println("Enter the element of A:");
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element of B:");
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				B[i][j]=sc.nextInt();
			}
		}
		int C[][]=new int[rows][cols];
		System.out.println("Addition of A and B:");
		for(i=0;i<rows;i++){
			for(j=0;j<cols;j++){
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(  C[i][j]+" ");
			}
			System.out.println();
		}
	}
}