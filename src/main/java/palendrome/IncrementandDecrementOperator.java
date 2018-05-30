package palendrome;

public class IncrementandDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100 ;
		int b = 200 ;

		//Pre Increament
		++a;
		++b;
		System.out.println("Pre Inc is =" + a );
		System.out.println("Pre Inc is =" + b );

		
		System.out.println("------------------");
		//Post Increament
		a++;
		b++;
		System.out.println("Post Inc is =" + a );
		System.out.println("Post Inc is =" + b );


		System.out.println("------------------");
		
		//Pre Decreament
		--a;
		--b;
		System.out.println("Pre Inc is =" + a );
		System.out.println("Pre Inc is =" + b );

		System.out.println("------------------");
		
		//Post Decreament
		a--;
		b--;
		System.out.println("Post Inc is =" + a );
		System.out.println("Post Inc is =" + b );
	}

}
