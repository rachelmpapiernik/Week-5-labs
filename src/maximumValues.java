/*August 5, Rachel Papiernik
This program reads an input file and outputs the largest number in each row
*/

import java.util.Scanner;
import java.io.*;

public class maximumValues

{
	public static void main(String args[]) throws FileNotFoundException
	
	{
		//file scanner
		Scanner input = new Scanner(new File("input.csv"));
		String line = "";
		int max = 0, count = 1;
		String[] arr = null;
	
		System.out.println("Maximum values"); 

		//reads each row for the largest number
		while (input.hasNext()) {
			line = input.nextLine();
			arr = line.split(",");
			max = 0;
			for (int i = 0; i < arr.length; i++) {
				if (Integer.parseInt(arr[i]) > max)
					max = Integer.parseInt(arr[i]);
			}
			//output largest number in each row
			System.out.println("ROW " + count + " : " + max);
			count++;
		}
	}
}