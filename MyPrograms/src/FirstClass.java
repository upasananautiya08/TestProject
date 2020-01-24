
import java.util.Scanner;

public class FirstClass {
	public static void main(String[] args)
	{
		int num1,num2,num3,num4;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		num1=scan.nextInt();
		System.out.println("Enter Second number");
		num2=scan.nextInt();
		scan.close();
		num3= num1*num2;
		System.out.print("The multiply of the number is =" +num3);
		num4=num1+num2;
		System.out.println("the sum is =" + num4);
		
	}
}
