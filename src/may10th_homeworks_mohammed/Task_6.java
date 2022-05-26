package may10th_homeworks_mohammed;

public class Task_6 {

	public static void main(String[] args) {

		/*
		 * valid browsers: chrome, firefox, opera, safari, edge, ie
		 * 
		 * string str = "chrome"
		 * 
		 * outPut: CHROME BROWSER IS SELECTED
		 * 
		 * 12:35
		 */

		String input = "chrome";
		String validBrowser = input.toUpperCase() + " BROWSER IS SELECTED";

//		if (input == "chrome") {  
//			System.out.println(validBrowser);
//		} else if (input == "firefox") {
//			System.out.println(validBrowser);
//
//		} else if (input == "opera") {
//			System.out.println(validBrowser);
//
//		} else if (input == "safari") {
//			System.out.println(validBrowser);
//
//		} else if (input == "edge") {
//			System.out.println(validBrowser);
//
//		} else if (input == "ie") {
//			System.out.println(validBrowser);
//
//		} else {
//			System.out.println("NOT VALID BROWSER!");
//		}
		
		
		switch(input) {
		
		case "chrome":
			System.out.println(input);
			break;
		case "firefox":
			System.out.println(input);
			break;
		default:
			System.out.println();
		
		}
	}

}
