import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit\n");
            String strplayer = scan.nextLine();
            strplayer = strplayer.toLowerCase();
            char chrplayer = strplayer.charAt(0);
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
            //Check the input
            if((chrplayer != 'r') && (chrplayer != 'p') && (chrplayer != 's')){
                break;
            }
            //If player won
            else if((chrplayer == 'r') && (computerChoice == 's') || (chrplayer == 's') && (computerChoice == 'p') || (chrplayer == 'p') && (computerChoice == 'r')){
                System.out.println("Result: You won 👏\n-Your choice: "+chrplayer+"\n-Computer choice: "+computerChoice);
            }
            //If the computer won
            else if((chrplayer == 's') && (computerChoice == 'r') || (chrplayer == 'p') && (computerChoice == 's') || (chrplayer == 'r') && (computerChoice == 'p')){
                System.out.println("Result: Computer won 😒\n-Your choice: "+chrplayer+"\n-Computer choice: "+computerChoice);
            }
            //If its tie
            else if((chrplayer == 'r') && (computerChoice == 'r') || (chrplayer == 'p') && (computerChoice == 'p') || (chrplayer == 's') && (computerChoice == 's')){
                System.out.println("Result: Tie 🥲\n-Your choice: "+chrplayer+"\n-Computer choice: "+computerChoice);
            }
                System.out.println("\n\n");
       }while(true);
    }
}
