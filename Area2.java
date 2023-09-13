import java.util.*;
class area1{
	void area(int x){
		System.out.println("Area of Square is:"+x*x);
	}
	void area(int x,int y){
		System.out.println("Area of ractangle is"+x*y);
	}
	void area(double x){
		double z=3.14*x*x;
		System.out.println("Area of circle is"+z);
	}
}
class Area2{
	public static void main(String args[]){
		int a,l,b;
		double r;
		Scanner sc=new Scanner(System.in);
		area1 obj=new area1();
		System.out.println("Enter the side of square:");
		a=sc.nextInt();
		obj.area(a);
		System.out.println("Enter the side of Rectangle:");
		l=sc.nextInt();
		b=sc.nextInt();
		obj.area(l,b);
		System.out.println("Enter the radius of circle:");
		r=sc.nextDouble();
		obj.area(r);
	}
}