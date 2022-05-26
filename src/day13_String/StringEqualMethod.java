package day13_String;

public class StringEqualMethod {

	public static void main(String[] args) {

		String word1 = "Hello";
		String word2 = "hello";
		String team = "RAIDERS";
		
		boolean b = word1.equals(word2);
		
		b = word1.equalsIgnoreCase(word2);
		
		
		b = "Raiders".equals("Raiders");
		b = "Raiders".equals("raiders");
		b = "Raiders".equalsIgnoreCase("Raiders");

		System.out.println(b);
		
		if(team.equalsIgnoreCase("raiders"))
			System.out.println("Go You " + team);
		
		boolean result = word1.equals(word2);
		
		
		
		
		
		
		
		
		
	}

}
