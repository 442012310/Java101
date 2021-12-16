import java.util.Scanner;

public class PowerFuncScanner{  
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            double num = scan.nextDouble();    
            System.out.println("Enter the power of a number");
            double power = scan.nextDouble();    
            System.out.println(Math.pow(num, power));  
        }    
    }
