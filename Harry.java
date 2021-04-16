package shubh;
import java.util.Scanner;
import java.util.Arrays;

public class Harry {

	public static void main(String[] args) {
		
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter any String:-\t");
		String name=sc.nextLine();
		String naam=name;
		String add="";
		
		int len=name.length();
		
		System.out.print("\nEnter Harry's value:-\t");
		int m=sc.nextInt();
		if(m>len) {
			System.out.println("You Have Entered the value more than the length of your String!!!\n");
		}
		
		System.out.print("Enter Potter's value:-\t");
		int n=sc.nextInt();
		
		String split1=name.substring(len-m, len);
		String split2=name.substring(0, len-m);
		add=split1+split2;
		i++;

		while(!name.matches(add)) {
				String split3=add.substring(len-m, len);
				String split4=add.substring(0, len-m);
				add=split3+split4;
				i++;
				
				String split5=add.substring(len-n, len);
				String split6=add.substring(0, len-n);
				add=split5+split6;
				i++;
		}
		System.out.println("\nThe Rotation done is " +(i)+ " times to get the Same String.");
	}
}