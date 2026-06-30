import java.util.Random;
import java.util.Scanner;
public class NumberGame{
	public static void main(String[]args){
	Random random = new Random();
	Scanner sc =  new  Scanner( System.in);
	int number = random.nextInt(100)+1;
	System.out.println("secret number= "+ number);
	int guess;
	System.out.println("welcome to number game!");
	System.out.println("guess a number between 1 and 100");
	do{
		System.out.print("enter your guess:");
		guess=sc.nextInt();
		 if(guess>number){
		 	System.out.println("Too high!");
		 } else if (guess<number){
		 	System.out.println("Too low!");
	}else{	 	
		 	System.out.println("correct!you guessed the number");
		 }
	} while (guess!=number);
sc.close();
}	
}
