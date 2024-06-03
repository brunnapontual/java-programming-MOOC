 import java.util.Scanner;
 
public class CheckingTheAge {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int n = Integer.valueOf(scanner.nextLine());
        
        if ( n < 0 || n > 120 ){
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
 
    }
}
 
