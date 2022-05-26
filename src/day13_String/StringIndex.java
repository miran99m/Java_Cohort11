package day13_String;

public class StringIndex {

	public static void main(String[] args) {

		String name = "President George Washington";
		
		System.out.println(name.indexOf(' '));
		System.out.println(name.indexOf('e', 3));
		System.out.println(name.indexOf("Washington"));
		System.out.println(name.lastIndexOf('e'));
		
		System.out.println(name.indexOf("George") > -1);
		
		
		

	}

}
