import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int v = 0;
 
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
 
            if (n == 0) {
                break;
            }
 
            if (n != 0) {
                v = v + 1;
                sum = sum + n;
            }
        }
        System.out.println("Number of numbers: " + v);
        System.out.println("Sum of the numbers: " + sum);
 
    }
}
