
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		scan.close();
		if(a>b)
		{
			int d= a>c?a:c;
			System.out.println("The largest number =" +d);
		}
		else
		{
			int d= b>c?b:c;
			System.out.println("The largest number =" +d);
		}
	}

}
