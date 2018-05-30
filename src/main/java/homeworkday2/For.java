package homeworkday2;

public class For
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int n [] = {25, 35, 60, 75, 90, 85, 22, 23};
		
		int total = n.length;
		
		for ( i = 0 ; i<total ; i++)
		
			if (n[i]>35)
		{
				System.out.println("Pass : " +" Your mark is " + n[i]);	
		}
		   else
		{
			System.out.println("Fail : " +" Your mark is " + n[i]);
		}

	}
	

}