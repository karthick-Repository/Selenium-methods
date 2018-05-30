package modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LearnRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String patt = "\\w{10,20}@\\w{5}\\W\\w{3}";
		String str = "karthickelango86@gmail.com";
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());*/
		
		String str = "TEST12345TestLeaf(10012)";
		String patt = "\\d{5}";
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
		//System.out.println(m.matches());
	}

}
