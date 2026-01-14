//try and catch
//try executes everytime
//catch ill execute when only exception is occurs in try block
package Exceptionhandling;
public class excptn {
public static void main(String[] args) {
	int arr[]= {2,3,4,5,6,7};
	String name="null";
	System.out.println(name.length());
	try {
//System.out.println(arr[10]);
	System.out.println(10/0);
	}
	catch(ArrayIndexOutOfBoundsException i) {
		System.out.println("no index 11th present in the array");
	}
	catch(ArithmeticException i) {
		System.out.println("you cant devide any number by zero");
	}
}
}
