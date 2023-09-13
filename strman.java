import java.util.*;
class strman{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=sc.nextLine();
		System.out.println("Enter first string");
		String str2=sc.nextLine();
		String str3=str1.concat(str2);
		System.out.println("String conacatination:"+str3);
		System.out.println("Total length:"+str3.length());
		System.out.println(str3+" To upper case: "+str3.toUpperCase());
		System.out.println(str3+" To lower case: "+str3.toLowerCase());
		System.out.println(str3+" Index at place 3 is: "+str3.charAt(3));
		System.out.println(str3+" Replace by: "+str3.replace(str3,"hello"));
	}
}
		
