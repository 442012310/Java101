import java.util.Scanner;
public class HeightAndWidth{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height");
        float height = scan.nextFloat();
        System.out.println("Enter the width");
        float width = scan.nextFloat();
        System.out.println(height * width);
    }
}
