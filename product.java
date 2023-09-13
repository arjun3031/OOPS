import java.util.*;
class product{
	int pcode,price;
	String pname;
	product(int pcode, String pname,int price){
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public static void main(String args[]){
		//String smallest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of product1:");
		System.out.println("Product code:");
		int pcode1=sc.nextInt();
		System.out.println("Product name:");
		String pname1=sc.next();
		System.out.println("Product price:");
		int price1=sc.nextInt();

		System.out.println("Enter the details of product2:");
		System.out.println("Product code:");
		int pcode2=sc.nextInt();
		System.out.println("Product name:");
		String pname2=sc.next();
		System.out.println("Product price:");
		int price2=sc.nextInt();
		
		System.out.println("Enter the details of product3:");
		System.out.println("Product code:");
		int pcode3=sc.nextInt();
		System.out.println("Product name:");
		String pname3=sc.next();
		System.out.println("Product price:");
		int price3=sc.nextInt();
		
		product ob1=new product(pcode1,pname1,price1);
		product ob2=new product(pcode2,pname2,price2);
		product ob3=new product(pcode3,pname3,price3);

		if(ob3.price<ob2.price && ob3.price<ob1.price){
			System.out.println("Lowest Product is:"+ ob3.pname);
		}
		else if(ob2.price<ob1.price){
			System.out.println("Lowest Product is:"+ ob2.pname);
		}
		else{
			System.out.println("Lowest Product is:"+ ob1.pname);
		}
		
	}
}
		