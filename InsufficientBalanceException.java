//exception class created for creating own exception
package Exceptionhandling;
public class InsufficientBalanceException extends RuntimeException{
public InsufficientBalanceException(String msg) {
super(msg);
}
}
