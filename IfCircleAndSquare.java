import java.util.Scanner;

public class IfCircleAndSquare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Number (1 or 2)");
	int num = scan.nextInt();
	if(num == 1){
            System.out.println("Enter a radius");
            float radius = scan.nextFloat();
            System.out.println(radius * radius * 3.14);
	}else if (num == 2){
            System.out.println("Enter a height");
            float height = scan.nextFloat();
            System.out.println("Enter a width");
            float width = scan.nextFloat();
            System.out.println(height * width);    	    
	}else{
            System.out.println("Error!!");
    	}
    }
}
