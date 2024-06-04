import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                break;
            }
            if (n != 0) {
                v = v + 1;
                sum = sum + n;
            }
        }
        double av = (sum * 1.0)/v;
        System.out.println("Average of the numbers: " + av);
 
    }
}
