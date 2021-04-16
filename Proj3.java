package shubh;
import java.util.Scanner;
import java.text.NumberFormat;
public class Proj3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int p,t;
		double r;
		
		while(true) {
		System.out.print("\nPrincipal(1K-1M):-\t");
		p=sc.nextInt();
		if(p>=1000 && p<=1000000)
			break;
			System.out.println("Enter the Principal Between 1K-1M");
		}
		
		while(true) {
		System.out.print("\nAnnual Interest Rate(1-20):-\t");
		r=sc.nextInt();
		if(r>1 && r<20)
			break;
			System.out.println("Enter the Annual Interest Rate Between 1-20");
		}
		
		while(true) {
		System.out.print("\nTime Period(1-30):-\t");
		t=sc.nextInt();
		if(t>1 && t<30)
			break;
			System.out.println("Enter the Time Period Between 1-30");
		}
		
		
		double m=(r*t)+p;
		
		String mm=NumberFormat.getCurrencyInstance().format(m);
		System.out.println("Mortgage Value is:-\t"+mm);
	}
}