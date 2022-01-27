package assignment;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");	
		double value1=sc.nextDouble();
		double value2=sc.nextDouble();
		System.out.println("enter the required operation");
		char operator=sc.next().charAt(0);
		double result=0;
		switch(operator) {
		case '+' : result=value1+value2;
		break;
		case '-' : result=value1-value2;
		break;
		case '*' : result=value1*value2;
		break;
		case '/' : result=value1/value2;
		break;
		default:
		System.out.println("Invalid operator");
		break;
		}
		System.out.println("the result is " + result);
	}

}
