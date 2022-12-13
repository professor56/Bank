package fuction;
import java.util.*;
public class Bank {
	static int b=0;
	public static void information(String name,int age,String email,int phone) {
		System.out.println("Welcome to Delhi bank");
		System.out.println();
		System.out.println("Your name: "+name);
		System.out.println("Your age: "+age);
		System.out.println("Your email: "+email);
		System.out.println("Your phone number: "+phone);
		
		  
	}
	public static void deposit(int number) {
		b+=number;
		System.out.println("You deposit "+(number)+" rupees in Delhi bank");
	}
	public static int balance() {
		System.out.println("Your balance: "+b);
		return b;
	}
	public static void withdraw(int nun) {
		b-=nun;
		System.out.println("your withdraw: "+b);
	}
	public static void loan(int tm,int mr,int d) {
		int in=(b*tm*mr*d);
		int rm=b+in;
		System.out.println("Your interest:  "+in);
		System.out.println("Total amount: "+rm);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		String n=in.next();
		System.out.println("Enter the age");
		int a=in.nextInt();
		if(a>=20) {
			System.out.println("You are eligible for create bank account");
		}
		else {
			System.out.println("You are not eligible for create bank account");
			return;
		}
		System.out.println("Enter the email");
		String e=in.next();
		System.out.println("Enter the phone number");
		int p=in.nextInt();
		information(n,a,e,p);
		while(true) {
			System.out.println("Choose opitions");
			System.out.println("1.Deposit");
			System.out.println("2.Balance");
			System.out.println("3.Withdraw");
			System.out.println("4.Loan");
			int ch=in.nextInt();
			int g;
			if(ch==1) {
				System.out.println("How much money deposit");
				g=in.nextInt();
				deposit(g);
			}
			else if(ch==2) {
				g=0;
				balance();
			}
			else if(ch==3) {
				System.out.println("How much money withdraw");
				int hb=in.nextInt();
				withdraw(hb);
			}
			else if(ch==4) {
				System.out.println("How much loan you want");
				int l=in.nextInt();
				System.out.println("Enter the interest rate");
				int r=in.nextInt();
				System.out.println("How many year loan you want");
				int k=in.nextInt();
				loan(l,r,k);
				
			}

		}
	}

}
