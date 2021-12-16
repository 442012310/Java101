import java.util.Scanner;

public class SwitchCircleAndSquare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number (1 or 2)");
        int num = scan.nextInt();
        switch  (num){
            case 1:
                System.out.println("Enter a radius");
                float radius = scan.nextFloat();
                System.out.println( radius * radius * 3.14);
                break;
            case 2:
                System.out.println("Enter a height");
                float height = scan.nextFloat();
                System.out.println("Enter a width");
                float width = scan.nextFloat();
                System.out.println(height * width);
                break;
            default:
                System.out.println("Error!!");
         }
    }
}
