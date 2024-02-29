 
import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Give a string: ");
        String text = scanner.nextLine();
        
        System.out.println("Give an integer: ");
        int v1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double: ");
        double v2 = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean v3 = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + v1);
        System.out.println("You gave the double " + v2);
        System.out.println("You gave the boolean " + v3);
 
    }
}
 
