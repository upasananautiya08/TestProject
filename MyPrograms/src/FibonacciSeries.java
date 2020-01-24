

public class FibonacciSeries {
	public static void main(String[] args) {
		int sum=0;
		int temp=1;
		int temp2=0;
		int i=0;
		while (i<10) {
			System.out.println(temp);
			sum=temp+temp2;
			temp2=temp;
			temp=sum;
			i++;
		}
		for(i=0;i<=10;i++) {
			System.out.println(temp);
			sum=temp+temp2;
			temp2=temp;
			temp= sum;
		}
	
		}
}



