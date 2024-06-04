import java.util.Scanner;
 
public class ComparingNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
        
        if ( n > n2 ){
            System.out.println(n + " is greater than " + n2 + ".");
        }else if ( n < n2 ){
            System.out.println(n + " is smaller than " + n2 + ".");
        }else{
            System.out.println(n + " is equal to  " + n2 + ".");
        }
    
 
    }
}
