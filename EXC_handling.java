//exception handling using try and catch
package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");
	try {
	int age =sc.nextInt();
	System.out.println("your age is : "+age);
	}
	catch(InputMismatchException i) {
		System.out.println("enter valiid age");
	}
}
}
