public class Division {
 
    public static void main(String[] args) {
        // should print "0.6"
        division(3, 5);
    }
    public static void division(int n, int denominator) {
        double answer = (double) n / (double) denominator;
        System.out.println(answer);
    }
}
