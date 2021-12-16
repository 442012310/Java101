import java.util.Scanner;

public class Counter{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		int counter = number;
		while (counter <= number + 10){
		System.out.println("The counter is "+counter);
		++counter;
		}
	}
}
