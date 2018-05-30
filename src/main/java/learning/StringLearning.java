package learning;

public class StringLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char var;
		int num;

		/*String ip = "a1b2c3";
			char[] x =ip.toCharArray();
			for (int i = 0; i < x.length; i++) {
				num=v(int)ip.charAt(i);
				var =(char)(num+1);
				System.out.println(var);
			}
			System.out.println();
*/
		String txt ="testleaf";
		char ch ='t';
		int count =0;
		char[] charArray =txt.toCharArray();
		for(char c:charArray) {
			if(c==ch) {
				count++;
			}
		}
		System.out.println(count);
	}

}