import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 100");
        float Degree;
        Degree = scan.nextFloat();
        if (Degree >= 90 && Degree <= 100){
            System.out.println("A");
        }else if(Degree >= 80 && Degree <= 90){
            System.out.println("B");
        }else if(Degree >= 70 && Degree <= 80){
            System.out.println("C");
        }else if(Degree >= 60 && Degree <= 70){
            System.out.println("D");
        }else if(Degree >= 0 && Degree <= 60){
            System.out.println("F");
        }else{
            System.out.println("Error!. Enter a number from 0 to 100");
        }
    }
}
