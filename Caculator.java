//packaging stuff
package Calculator;

//importing stuff
import java.util.Scanner;  
 
class Caculator  
 {  
  public static void main(String args[])  
   {
    //Start commands
    int a;  
    float b;  
    String Command;  
    
    //start input area
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter a command: (Dont know the commands? Type 'Help' Or go to goo.gl/7baiQK)");  
    Command = in.nextLine();  
    System.out.println("You entered string "+s);  
    System.out.println("Enter an integer");  
    a = in.nextInt();  
    System.out.println("You entered integer "+a);  
    System.out.println("Enter a float");  
    b = in.nextFloat();  
    System.out.println("You entered float "+b);   
  }  
 }  
