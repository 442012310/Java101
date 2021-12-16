import java.util.Scanner;

public class Radius{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter radius of a circle");
        float radius = scan.nextFloat();
        System.out.println(radius * radius * 3.14);
    }
}
