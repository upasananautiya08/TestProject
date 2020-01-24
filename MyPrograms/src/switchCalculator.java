
import java.util.Scanner;
public class switchCalculator {
	public static void main(String[] args) {
		char oper;
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a= scan.nextInt();
		b=scan.nextInt();
		System.out.println("Enter the operation");
		oper= scan.next().charAt(0);
		scan.close();
		switch(oper) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		}
	}

}
