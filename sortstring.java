import java.util.*;
class sortstring{
	public static void main(String args[]){
		int i,j,n;
		String temp;
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		n=obj1.nextInt();
		//Scanner obj2=new Scanner(System.in);
		String str[]=new String[n];
		System.out.println("Enter the strings:");
		for(i=0;i<n;i++)
		str[i]=obj1.next();
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(str[i].compareTo(str[j])>0){
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("Sorted Strings:");
		for(i=0;i<n;i++)
		System.out.println(str[i]);
	}
}
		