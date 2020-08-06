/*August 5, Rachel Papiernik
This program reads each line until the user enters the word "done." The program will termimate when done is entered.
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class userStrings{
   public static void main(String[] args) throws IOException {

       //path of output file
       BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Rachel\\Desktop\\userStrings.txt"));

       //scanner reads user input
       Scanner input = new Scanner(System.in);
       String userstring;

       System.out.println("Enter strings (DONE to quit): ");
       boolean choice=true;
      
       //this loop will go until the word "done" is entered by the user
       do
       {
           userstring=input.nextLine();

           //condition to terminate the program
           if(userstring.toLowerCase().equals("done"))
           {
               choice=false;
               break;
           }
           else
           {
               //write string to file
               writer.write(userstring);
               writer.newLine();
             
           }
       }while(choice);

       writer.close();
       input.close();
   }
}
