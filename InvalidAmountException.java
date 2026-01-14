//class for invalid amount Exception
package Exceptionhandling;
public class InvalidAmountException extends RuntimeException {
public InvalidAmountException(String msg) {
	super(msg);
}
}
