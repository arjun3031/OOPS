import java.util.*;
class symmetric{
	public static void main(String args[]){
		int i,j,rows,cols,f=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows=n.nextInt();
		System.out.println("Enter the number of cols:");
		cols=n.nextInt();
		if(rows!=cols)
			System.out.println("Not symmetric");
		else{
			int num[][]=new int[rows][cols];
			System.out.print("Enter the elements of Matrix:");
			for(i=0;i<rows;i++){
				for(j=0;j<cols;j++){
					num[i][j]=n.nextInt();
				}
			}
			for(i=0;i<rows;i++){
				for(j=0;j<cols;j++){
					if(num[i][j]!=num[j][i]){
						f=1;
						break;
					}
				}
			}
			if(f==1)
				System.out.println("Not Symmetric");
			else
				System.out.println("Symmetric");
		}
	}
}

				