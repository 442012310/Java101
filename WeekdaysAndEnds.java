import java.util.Scanner;

public class WeekdaysAndEnds{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("The day number");
        int days = scan.nextInt();
        switch (days){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:  
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error!!");
        }
    }
}
