import java.util.*;
class search{
	public static void main(String args[]){
		int i,size,f=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];	
		System.out.println("Enter the elements of array:");
		for(i=0;i<size;i++)
		arr[i]=sc.nextInt();
		System.out.println("Enter the element to be search:");
		a=sc.nextInt();
		for(i=0;i<size;i++){
			if(arr[i]==a){
				f=1;		
				break;
			}
		}
		if(f==1)
			System.out.println(a+ " Found at position " +(i+1));
		else
			System.out.println("Not found");
	}
}