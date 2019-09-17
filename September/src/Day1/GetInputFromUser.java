//GetInputFromuser Program
package Day1;

import java.util.Scanner; 
  
class GetInputFromUser 
{ 
    public static void main(String args[]) 
    { 
        // Using Scanner for Getting Input from User 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter a String :");
  
        String s = in.nextLine(); 
        System.out.println("You entered string "+s); 
        System.out.println("Enter a Integer :");
  
        int a = in.nextInt(); 
        System.out.println("You entered integer "+a); 
        System.out.println("Enter a Float :");
  
        float b = in.nextFloat(); 
        System.out.println("You entered float "+b); 
        System.out.println("Your Program is worked funtastic !") ;
    } 
} 