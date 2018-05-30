package programLearning;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b ;
		System.out.println("Enter the Value");

		Scanner Mul = new Scanner(System.in);
		a= Mul.nextInt();

		System.out.println("Multiplication table for the " + a + " is" );

		for (b=1 ; b<=10 ; b++)
		{
		
			System.out.println(a +"*"+ b +"="+ (a*b));
			Mul.close();
		}


	}

}
