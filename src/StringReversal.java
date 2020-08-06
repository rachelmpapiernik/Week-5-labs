import java.util.Scanner;

public class StringReversal {

	//driver program

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter a phrase
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String rev_string = reverseString(s);
	
		//output reversed phrase
		System.out.println("Reversed string : " + rev_string);
		
		//close scanner
		sc.close();		
	}
	//recursive method
	public static String reverseString(String s)
	{
		if (s.isEmpty())
			return s;
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}
