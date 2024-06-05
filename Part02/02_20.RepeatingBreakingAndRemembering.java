import java.util.Scanner;
 
public class RepeatingBreakingAndRemembering {
 
    public static void main(String[] args) {
        
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Give numbers:");
        int sum = 0;
        int validN = 0;
        double average;
        int evenN = 0;
        int oddN = 0;
 
        while (true) {
            int n = Integer.valueOf(scanner.nextLine());
 
            if (n == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
 
            if (n % 2 == 0) {
                evenN++;
            }
 
            if (n % 2 != 0) {
                oddN++;
            }
 
            sum += n;
            validN++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + validN);
        average = ((sum * 1.0) / validN);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenN);
        System.out.println("Odd " + oddN);
 
    }
}
