package shubh;
import java.util.Scanner;
import java.text.NumberFormat;
public class Proj1 {

	public static void main(String[] args) {
		System.out.println("Enter the Principal,Annual Investment,Period:-");
		Scanner sc=new Scanner(System.in);
		System.out.print("\nPercentage:-  ");
		double p=sc.nextInt();
		System.out.print("Annual Investment:-  ");
		float r=sc.nextFloat();
		float mr=r/100;
		float mmr=mr/12;
		System.out.print("Period:-  ");
		int n=sc.nextInt();
		int n1=n*12;
		float q=1+mmr;
		double t=Math.pow(q, n1);
		double m=p*t/(t-1);
		String m1=NumberFormat.getCurrencyInstance().format(m);
		System.out.print("Your Mortgage is:-   "+m1);
	}

}
