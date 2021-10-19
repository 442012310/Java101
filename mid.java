import java.util.Scanner;
public class Mid{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
        int dob = 2021 - age;
        if (dob < 1990){
            System.out.println("Hi "+name+", in "+dob+" you should have played Pac-Man");
        }else if (dob >= 1990 && dob <= 2000){
            System.out.println("Hi "+name+", in "+dob+" you should have played Super Mario or Kick off 2");
        }else{
            System.out.println("Hi "+name+", in "+dob+" you should have played Fifa");
        }

	}
}

