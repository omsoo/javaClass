// Program that adds two number
import java.util.Scanner;
public class apples{

    public static void main(String args[]){
        Scanner sunny = new Scanner(System.in); // creating the variable "sunny" for the Scanner
        double firstNum, secondNum, answer;
        System.out.println("Enter first number: ");
        firstNum = sunny.nextDouble();
        System.out.println("Enter the second number");
        secondNum = sunny.nextDouble();
        answer = firstNum * secondNum;
        System.out.println("The product of "+ firstNum +" and "+ secondNum +" is = "+ answer);
    }
}