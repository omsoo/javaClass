// My first Java code
import java.util.Scanner;
public class apples{
	public static void main(String args[]){
		System.out.println("What is your name: ");
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Welcome, \""+ userInput1.nextLine() +"\" its nice to meet you \n" );

		System.out.println("Where do you wanna go today?");
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("\""+ userInput2.nextLine() +"\" is a nice place to go \n");

		System.out.println("How long are you gonna be there? ");
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("Wow! \""+ userInput3.nextLine() +"\" is a good time \n");
	}
}