import java.util.Scanner;

public class NegativeOrPositive{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entar a Number");
        float num = scan.nextFloat();
        if (num < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
    }
}
