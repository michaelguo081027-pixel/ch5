import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
		Random random = new Random();
        int number = random.nextInt(100) + 1;
        int times = 3;
		Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number, 3 times left: ");
        int guess = in.nextInt();
		if(guess < number){
			times=times-1;
			System.out.println("Your guess is lower than mine!");
			System.out.print("Type a number, "+times+" times left: ");
			in.nextInt();
		}else if(guess > number){
				times=times-1;
				System.out.println("Your guess is higher than mine!");
				System.out.print("Type a number, "+times+" times left: ");
				in.nextInt();
			}else{
				System.out.println("You guessed it out, congrats!");
			}
		}
		/*else{
			System.out.println("Game over! My number is: "+number);
		}
		
	}
	*/
}
