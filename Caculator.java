//packaging stuff
package Calculator;

//importing stuff
import java.util.Scanner;  
 
public class Caculator  
 {  
  public static void main(String args[])  
   {
    //Start commands
    String error = "Command not found! Type 'help' For commands. (Try again)";
    String test = "test dis";  
    String help = "help";  
    
    //input sections
    String input;  
    String output;
    
    //input numbers
    int A;
    int B;
    int C;
    int D;
    
    //basic methods
    double add;
    double sub;
    double times;
    
    //formula;
    double area;
    double lengthtimeshight;
    
    //start input area
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter a command: (Dont know the commands? Type 'help' Or go to goo.gl/7baiQK)");   
    input = in.nextLine();
    
    if (input.equals("help")) {
        System.out.println(""+help);
    } else if (input.equals("test")) {
        System.out.println(""+test);
    } else {
        System.out.println(""+error);
        in.reset();
        input = in.nextLine();
    }
  }  
 }  
