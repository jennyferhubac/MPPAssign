package assignment06.regularexpression;

import java.util.regex.*;

public class PatternMatching {
	
	private static final String PLATE_NUMBER_FORMAT = "[A-Z]{2}[0-9]{4}[A-Z]{3}";
	private static final String EIGHT = "eight";
	private static final String WORD = "[\\W\\s]";
	private static final String IA_AREA_CODE = "[6][4][1]-[0-9]{3}-[0-9]{4}"; 
	private static final String EMAIL_ADDRESS_FORMAT = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Plate number exercise");
		System.out.println("------------------------------------------------------");
		String ABC1234aaa = "ABC1234aaa";
		System.out.println("Is ABC1234aaa valid? -- " + ABC1234aaa.matches(PLATE_NUMBER_FORMAT));
		
		String AB1234DF= "AB1234DF";
		System.out.println("Is AB1234DF valid? -- " + AB1234DF.matches(PLATE_NUMBER_FORMAT));
		
		
		String AB1234DFG = "AB1234DFG";
		System.out.println("Is AB1234DFG valid? -- " + AB1234DFG.matches(PLATE_NUMBER_FORMAT));

		System.out.println("------------------------------------------------------");
		
		System.out.println("Replace All exercise");
		System.out.println("------------------------------------------------------");
		
		String str1 = "123458";
		
		System.out.println(str1 + " replace 8 with 'eight' \t" +str1.replaceAll("8", EIGHT));
		
		String str2 = "ABC82348GHIJ8";
		System.out.println(str2 + " replace 8 with 'eight' \t" +str2.replaceAll("8", EIGHT));
		
		System.out.println("Regular Expression exercise");
		
		System.out.println("Count words exercise");
		System.out.println("------------------------------------------------------");
		
		String myString = "I am currently very hungry.";
		
		System.out.println("Word count: " + myString.split(WORD).length);
		
		System.out.println("Check area code exercise");
		System.out.println("------------------------------------------------------");
		
		String phone1 = "651-345-6789";
		String phone2 = "641-451-3222";
		String phone3 = "231-651-3442";
		
		System.out.println("Is phone number: " + phone1 + " from IA?\t" + phone1.matches(IA_AREA_CODE) );
		System.out.println("Is phone number: " + phone2 + " from IA?\t" + phone2.matches(IA_AREA_CODE) );
		System.out.println("Is phone number: " + phone3 + " from IA?\t" + phone3.matches(IA_AREA_CODE) );
		
		System.out.println("Email address format checker");
		System.out.println("------------------------------------------------------");
		
		String email1 = "abc@foo.com.abc";
		String email2 = "123abc@hotmail.com";
		String email3 = "abc.def*gmail.com";
		
		System.out.println("Is email address: " + email1 + " valid?\t" + email1.matches(EMAIL_ADDRESS_FORMAT));
		System.out.println("Is email address: " + email2 + " valid?\t" + email2.matches(EMAIL_ADDRESS_FORMAT));
		System.out.println("Is email address: " + email3 + " valid?\t" + email3.matches(EMAIL_ADDRESS_FORMAT));
		
		System.out.println("======================================================\n");
		System.out.println("Using Pattern and Matcher Classes");
		
		Matcher matcher;
		Pattern pattern = Pattern.compile(PLATE_NUMBER_FORMAT);
		
		matcher = pattern.matcher(ABC1234aaa);
		System.out.println("Is ABC1234aaa valid? -- " + matcher.matches());
		
		matcher = pattern.matcher(AB1234DF);
		System.out.println("Is AB1234DF valid? -- " + matcher.matches());
		
		matcher = pattern.matcher(AB1234DFG);
		System.out.println("Is AB1234DFG valid? -- " + matcher.matches());
		
		System.out.println("======================================================");
		pattern = Pattern.compile("8");
		matcher = pattern.matcher(str1);
		
		System.out.println(str1 + " replace 8 with 'eight' \t" +matcher.replaceAll(EIGHT));
		
		matcher = pattern.matcher(str2);
		System.out.println(str2 + " replace 8 with 'eight' \t" +matcher.replaceAll(EIGHT));
		
		
	}

}
