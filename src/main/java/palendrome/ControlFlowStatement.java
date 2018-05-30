package palendrome;

public class ControlFlowStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// simple if
		
		int a = 50 ;
		int b = 85 ;
		int c = 100 ;
		if (a>b);

		System.out.println("A is always a Greater number");


		System.out.println("------------------");

		// If Else 

		if (a > b) {
			System.out.println("A is always a Greater number");
		} 
		else 
		{
			System.out.println("B is always a Greater number");
					}

		System.out.println("------------------");

		// Ladder Statement 

		int m1=150;  

		if(m1<50){  
			System.out.println("fail");  
		}  
		else if(m1>=50 && m1<60){  
			System.out.println("D grade");  
		}  
		else if(m1>=60 && m1<70){  
			System.out.println("C grade");  
		}  
		else if(m1>=70 && m1<80)
		{  
			System.out.println("B grade");  
		}  
		else if(m1>=80 && m1<90){  
			System.out.println("A grade");  
		}
		else if(m1>=90 && m1<100)
		{  
			System.out.println("A+ grade");  
		}else
		{  
			System.out.println("Invalid!");  
		}
		System.out.println("------------------");

		// Switch Statement 

		int number=30;
		
		switch(number)
		{  
		case 10: 
			System.out.println("10");
			break;  
				
		case 20: 
			System.out.println("20");
			break;  
		
		case 30:
			System.out.println("30");
			break;
			
		default:System.out.println("Not in 10, 20 or 30");  
		}
	
	}

}
