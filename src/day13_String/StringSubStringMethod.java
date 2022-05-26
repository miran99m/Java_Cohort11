package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {

		String str1 = "Television";
		System.out.println(str1.substring(4));
		
		System.out.println(str1.substring(2,5));
		
		String str2 = "Immuatable";
		
		System.out.println(str2.substring(2));
		
		System.out.println(str2.substring(4));
		
		System.out.println(str2.substring(4,9));
		
		//				0123456789
		String email = "firstName.lastName@domainName.com";
		String gmail = "irfan.techcircle@gmail.com";
		
		System.out.println(gmail.indexOf('g'));
		System.out.println(gmail.lastIndexOf('l'));
		
		System.out.println(gmail.substring(17,22));
		System.out.println(email.substring(19,29));
		
		
		System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf('l')));
		

	}

}
