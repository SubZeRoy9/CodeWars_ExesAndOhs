/* Check to see if a string has the same amount of 'x's and 'o's. 
 * The method must return a boolean and be case insensitive. The string can contain any char.*/

import java.util.Scanner;

public class XO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the string to \nsee if there are an equal number of x's and o's...");
		String str1 = scan.next();
		System.out.println(getXO(str1));

	}
	  public static boolean getXO (String str) {
		int ocount = 0;
		int xcount = 0;
		char[] analyze = str.toCharArray();
		
		for (int i = 0; i < analyze.length; i++) {
			
			switch (analyze[i]) {
			case 'x': 
				xcount++;
				break;
			case 'X':
				xcount++;
				break;
			case 'o':
				ocount++;
				break;
			case 'O':
				ocount++;
				break;
			default: 
				break;
			}
		}
		
		if (ocount == xcount) {
			return true;
		}
		else {
			return false;
		}
		
		    
		    
		    
	  }
}
