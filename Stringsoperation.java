import java.util.*;
public class Stringsoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
           //Converting to uppercase and finding length
           System.out.println("Enter a String: ");
           String input=sc.nextLine();
           System.out.println("UpperCase String: "+input.toUpperCase());
           System.out.println("Length of the String: "+input.length());
           //replacing character with another
           System.out.println("Enter the character to replace: ");
           char oldChar = sc.next().charAt(0);
           System.out.println("Enter the new character: ");
           char newChar = sc.next().charAt(0);
             System.out.println("Replaced character from "+oldChar+" to "+newChar);
           String ReplacedString = input.replace(oldChar, newChar);
           System.out.println("Given String: "+input);
           System.out.println("Replaced String: "+ReplacedString);
           //extracting substring
            System.out.println("Enter starting index: ");
            int Startindex=sc.nextInt();
            System.out.println("Enter ending index: ");
            int Endindex=sc.nextInt();
            String subString=input.substring(Startindex, Endindex);
            System.out.println("Extracted String: "+subString);
            sc.close();
        }    
    }
}
