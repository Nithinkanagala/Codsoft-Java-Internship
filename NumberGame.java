//TASK-1
import java.util.*;
public class numbergame{
	public static void repeat(){
		System.out.print("Do you want to continue(y/n):");
		Scanner sc=new Scanner(System.in);
		String ch=sc.nextLine();
		if (ch.equals("y") || ch.equals("Y")) {
			guessingNumberGame();
		} else {
			System.out.println("Thanks! for playing");
		}
	}
	public static void guessingNumberGame(){
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100 * Math.random());
		int K = 6;
		int i, guess;
		for (i = 0; i < K; i++){
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess){
				System.out.println("Congratulations! You guessed the number.");
                System.out.println();
				repeat();
				break;
			}
			else if(number > guess && i != K - 1){
				System.out.println("The number is greater than " + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);
			}
		}
		if (i == K) {
			System.out.println("You are failed please try again!");
            System.out.println("The number was " + number);
            System.out.println();
			repeat();
		}
	}
	public static void main(String arg[])
	{
		System.out.println("A number is chosen between 1 to 100.");
        System.out.println("Guess the number within 6 trials.");
		guessingNumberGame();
	}
}

/*A number is chosen between 1 to 100.
Guess the number within 6 trials.
Guess the number:
76
The number is less than 76
Guess the number:
34
The number is greater than 34
Guess the number:
54
The number is less than 54
Guess the number:
43
The number is greater than 43
Guess the number:
50
The number is less than 50
Guess the number:
47
You are failed please try again!
The number was 44

Do you want to continue(y/n):n
Thanks! for playing */
