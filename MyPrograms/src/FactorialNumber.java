
import java.util.Scanner;
public class FactorialNumber {
	public static void main(String[] args)
	{
		int num;
		int fact=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		num=scan.nextInt();
		scan.close();
		for (int i =1; i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println("The factor is = "+fact);
	}
}
